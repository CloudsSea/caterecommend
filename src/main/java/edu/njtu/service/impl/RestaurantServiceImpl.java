package edu.njtu.service.impl;

import com.github.pagehelper.PageHelper;
import edu.njtu.httpbody.restaurant.*;
import edu.njtu.mapper.*;
import edu.njtu.model.*;
import edu.njtu.service.RestaurantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service("restaurantService")
public class RestaurantServiceImpl implements RestaurantService {
    public static final String PHOTO_PREFIX = "http://saaswork.oss-cn-beijing.aliyuncs.com/";
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private BusinessMapper businessMapper;

    @Resource
    private RecommendDefaultMapper recommendDefaultMapper;
    @Resource
    private RecommendUserMapper recommendUserMapper;

    @Resource
    private UserMapper userMapper;

    @Resource
    private PhotoMapper photoMapper;

    @Override
    public RestaurantListDBody getRestaurantList(RestaurantListABody restaurantListABody, HttpSession session) throws Exception {
        RestaurantListDBody restaurantListDBody = new RestaurantListDBody();
        BusinessExample businessExample = new BusinessExample();
        int pageNo = restaurantListABody.getPageNo();
        int pageSize = restaurantListABody.getPageSize();
        PhotoExample photoExample = new PhotoExample();

        Integer optType  = null;
        Long userId = null;
        if(null != restaurantListABody.getOptType()){
            optType = restaurantListABody.getOptType();
        }else{
            User user = (User) session.getAttribute("userInfo");
            if (null != user) {
                userId = user.getUserIdInt();
                logger.info(user.toString());
                optType = 5;
            }else{
                optType = 4;
            }
        }


        switch ( optType) {
            case 2://获取默认推荐的  商家列表
                List<Business> businessDefaultRecommendList = getRecommandDefaultRestaurantList(businessExample,restaurantListABody.getPageNo(),restaurantListABody.getPageSize());
                restaurantListDBody.setBusinessDefaultRecommendList(businessDefaultRecommendList);
                break;
            case 3://获取根据用户推荐的  商家列表


                List<Business> businessUserRecommendList = getRecommandUserRestaurantList(businessExample, userId,pageNo,pageSize);
                restaurantListDBody.setBusinessUserRecommendList(businessUserRecommendList);
                break;
            case 4://同时获取原生+默认推荐 商家列表, pageSize和pageNo只作用于  原生 的商户列表
            case 5://同时获取原生+用户推荐
                //原生
                List<Business> businessesList2 = getRestaurantList(restaurantListABody, businessExample);
                restaurantListDBody.setBusinessList(businessesList2);
                if(4 == optType){
                    List<Business> businessDefaultRecommendList2 = getRecommandDefaultRestaurantList(businessExample,1,12);
                    //默认推荐
                    restaurantListDBody.setBusinessDefaultRecommendList(businessDefaultRecommendList2);

                    break;
                }else{
                    List<Business> businessUserRecommendList2 = getRecommandUserRestaurantList(businessExample, userId,1,12);
                    restaurantListDBody.setBusinessUserRecommendList(businessUserRecommendList2);
                    break;
                }
            case 1://获取原生的  商户列表
            default:
                List<Business> businessesList = getRestaurantList(restaurantListABody, businessExample);
                restaurantListDBody.setBusinessList(businessesList);
                break;
        }

        if(null != restaurantListDBody.getBusinessList()){
            restaurantListDBody.getBusinessList().stream().map(business -> {
                return getBusinessPhoto(photoExample, business);
            }).collect(Collectors.toList());
//            restaurantListDBody.setBusinessList(businessList2);
        }
        if (null != restaurantListDBody.getBusinessDefaultRecommendList()) {
            restaurantListDBody.getBusinessDefaultRecommendList().stream().map(business -> {
                return getBusinessPhoto(photoExample, business);
            }).collect(Collectors.toList());
        }
        if(null != restaurantListDBody.getBusinessUserRecommendList()){
            restaurantListDBody.getBusinessUserRecommendList().stream().map(business -> {
                return getBusinessPhoto(photoExample, business);
            }).collect(Collectors.toList());
        }
        //成功
        restaurantListDBody.setCode("10000");
        restaurantListDBody.setMsg("SUCCESS");
        return restaurantListDBody;
    }

    private Business getBusinessPhoto(PhotoExample photoExample, Business business) {

        photoExample.clear();
        photoExample.createCriteria().andBusinessIdEqualTo(business.getBusinessId());
        PageHelper.startPage(1, 5, false);
        List<Photo> photoList = photoMapper.selectByExample(photoExample);
        photoList.stream().map(photo -> {
            photo.setPhotoId(PHOTO_PREFIX + photo.getPhotoId()+".jpg");
            return photo;
        }).collect(Collectors.toList());
        business.setPhotoList(photoList);
        return business;
    }


    private List<Business> getRestaurantList(RestaurantListABody restaurantListABody, BusinessExample businessExample) {
        PageHelper.startPage(restaurantListABody.getPageNo(),restaurantListABody.getPageSize(),false);
        return businessMapper.selectByExample(businessExample);
    }

    private List<Business> getRecommandDefaultRestaurantList(BusinessExample businessExample,int pageNo,int pageSize) {
        List<Business> businessDefaultRecommendList = new ArrayList<Business>();
        List<RecommendDefault> recommendDefaultList = RecommendServiceImpl.getRecommandDefaultRestaurant(recommendDefaultMapper, pageNo, pageSize);
        for (RecommendDefault recommendDefault : recommendDefaultList) {
            businessExample.clear();
            businessExample.createCriteria().andBusinessIdEqualTo(recommendDefault.getBusinessId());
            Business business = businessMapper.selectByExample(businessExample).get(0);
            businessDefaultRecommendList.add(business);
        }
        return businessDefaultRecommendList;
    }

    private List<Business>  getRecommandUserRestaurantList(BusinessExample businessExample, Long userId,int pageNo,int pageSize) {
        List<Business> businessUserRecommendList = new ArrayList<Business>();
        List<RecommendUser> recommendUserList = RecommendServiceImpl.getRecommandUserRestaurant(recommendUserMapper, userId, pageNo, pageSize);
        for (RecommendUser recommendUser : recommendUserList) {
            businessExample.clear();
            logger.info(recommendUser.toString());
            businessExample.createCriteria().andBusinessIdIntEqualTo(recommendUser.getBusinessIdInt());
            Business business = businessMapper.selectByExample(businessExample).get(0);
            businessUserRecommendList.add(business);
        }
        return businessUserRecommendList;
    }


    @Override
    public RestaurantInsertDBody restaurantInsert(RestaurantInsertABody restaurantInsertABody) {
        return null;
    }

    @Override
    public RestaurantUpdateDBody restaurantUpdate(RestaurantUpdateABody restaurantUpdateABody) {
        return null;
    }

    @Override
    public RestaurantDetailDBody restaurantDetail(RestaurantDetailABody restaurantDetailABody) {
        return null;
    }
}
