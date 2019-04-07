package edu.njtu.tools;

import com.alibaba.fastjson.JSONObject;
import edu.njtu.mapper.*;
import edu.njtu.model.*;
import edu.njtu.model.ori.Attributes;
import edu.njtu.model.ori.Compliments;
import edu.njtu.model.ori.Reviews;
import edu.njtu.model.ori.Votes;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InsertTableTools {
    public static final String FILTERD_BUSINESS_FORMAT_JSON = "FilterdBusiness_format.json";
    public static final String FILTERED_USER_FORMAT_JSON = "FilteredUser_format.json";
    public static final String FILTERED_PHOTO_FORMAT_JSON = "FilteredPhoto_format.json";
    public static final String FILTERED_REVIEW_FORMAT_JSON = "FilteredReview_format.json";
    private static Logger logger = LoggerFactory.getLogger(InsertTableTools.class);

    @Resource
    public BusinessMapper businessMapper;
    @Resource
    public AttributeMapper attributeMapper;

    @Resource
    public AmbienceMapper ambienceMapper;
    @Resource
    public CategoriesMapper categoriesMapper;
    @Resource
    public DietaryRestrictionsMapper dietaryRestrictionsMapper;
    @Resource
    public GoodForMapper goodForMapper;
    @Resource
    public HairTypesSpecializedInMapper hairTypesSpecializedInMapper ;
    @Resource
    public HoursMapper hoursMapper;
    @Resource
    public BusMidCategoryMapper busMidCategoryMapper;
    @Resource
    public MusicMapper musicMapper;
    @Resource
    public NeighborhoodMapper neighborhoodMapper;
    @Resource
    public ParkingMapper parkingMapper;

    @Resource
    public UserMapper userMapper;
    @Resource
    public EliteMapper  eliteMapper;
    @Resource
    public ComplimentMapper complimentMapper;
    @Resource
    public FriendMapper friendMapper;
    @Resource
    public FansMapper fansMapper;


    @Resource
    public VoteMapper voteMapper;
    @Resource
    public ReviewMapper reviewMapper;
    @Resource
    public PhotoMapper photoMapper;

    public void readFile() {
        String [] files = new String[]
                {FILTERD_BUSINESS_FORMAT_JSON, FILTERED_USER_FORMAT_JSON,
                        FILTERED_PHOTO_FORMAT_JSON, FILTERED_REVIEW_FORMAT_JSON};
//        String filePath = "D:\\Yun\\Yun2018\\软件架构和云服务\\data\\FilteredUser_format.json";
//        String filePath = "D:\\Yun\\Yun2018\\软件架构和云服务\\data\\FilteredPhoto_format.json";
//        String filePath = "D:\\Yun\\Yun2018\\软件架构和云服务\\data\\FilteredReview_format.json";
//        String filePath = "D:\\Yun\\Yun2018\\软件架构和云服务\\data\\temp.json";
//        Dataset dfs = sqlContext.read().json(filePath);
//        List<String> jsonList = dfs.toJSON().collectAsList();
        logger.info("=====================================================>开始");
        String separator = File.separator;
        String path = separator+"opt"+separator+"install"+separator+"docker"+separator+"caterecommend"+separator;


        for (String fileName : files) {
            if(! fileName.equals(FILTERD_BUSINESS_FORMAT_JSON)){
                continue;
            }
            List<String> jsonList = toArrayByFileReader1(path+fileName);
            switch (fileName){
                case FILTERD_BUSINESS_FORMAT_JSON:
                    insertBusinessRelatedTable(jsonList);
                    break;
                case FILTERED_USER_FORMAT_JSON:
                    insertUser(jsonList);
                    break;
                case FILTERED_PHOTO_FORMAT_JSON:
                    insertPhoto(jsonList);
                    break;
                case FILTERED_REVIEW_FORMAT_JSON:
                    insertReview(jsonList);
                    break;
            }
        }
        logger.info("=====================================================>结束");

    }
    private void insertReview(List<String> jsonList) {
        //vote
        //review
        List<Reviews> reviewList = jsonList.stream().map(s -> {
            return JSONObject.parseObject(s, Reviews.class);
        }).collect(Collectors.toList());
        for (Reviews reviewOri : reviewList) {
            Review review = reviewOri;
            try {
                UserKey userKey = new UserKey();
                userKey.setUserId(reviewOri.getUserId());

                User user = userMapper.selectByPrimaryKey(userKey);
                if (null != user) {
                    review.setUserName(user.getName());
                }

                Votes votes = reviewOri.getVotes();
                if(null != votes){
                    review.setUseful(votes.getUseful());
                    review.setCool(votes.getCool());
                    review.setFunny(votes.getFunny());
                }
                reviewMapper.insertSelective(review);
            } catch (Exception e) {
                logger.error("friend insert:", e);
            }

        }


        //TODO vote的插入

    }

    private void insertPhoto(List<String> jsonList) {
        //photo
        List<Photo> photoList = jsonList.stream().map(s -> {
            return JSONObject.parseObject(s, Photo.class);
        }).collect(Collectors.toList());

        for (Photo photo : photoList) {
            try {
                photoMapper.insertSelective(photo);
            } catch (Exception e) {
                logger.error("friend insert:", e);
            }
        }


    }



    private void insertUser(List<String> jsonList) {
        List<edu.njtu.model.ori.User> usersList = jsonList.stream().map(s -> {
            return JSONObject.parseObject(s, edu.njtu.model.ori.User.class);
        }).collect(Collectors.toList());



        //user_elite
        //user_compliments
        //user_friends
        //user_fans
        //TODO  插入 compliments的相关信息
        //TODO 插入 fans的相关信息

        for (edu.njtu.model.ori.User oriUser : usersList) {
            User user = oriUser;

            Compliments compliments = oriUser.getCompliments();
            if (null != compliments) {
                if (null != compliments) {
                    user.setComplimentsHot(compliments.getHot());
                    user.setComplimentsFunny(compliments.getFunny());
                    user.setComplimentsCute(compliments.getCute());
                    user.setComplimentsCool(compliments.getCool());
                    user.setComplimentsList(compliments.getList());
                    user.setComplimentsMore(compliments.getMore());
                    user.setComplimentsNote(compliments.getNote());
                    user.setComplimentsPhotos(compliments.getPhotos());
                    user.setComplimentsPlain(compliments.getPlain());
                    user.setComplimentsProfile(compliments.getProfile());
                    user.setComplimentsWriter(compliments.getWriter());
                }
            }


            Votes votes = oriUser.getVotes();
            if(null != votes){
                user.setVotesUseful(votes.getUseful());
                user.setVotesCool(votes.getCool());
                user.setVotesFunny(votes.getFunny());
            }

            try {

                userMapper.insertSelective(user);
            } catch (Exception e) {
                logger.error("user insert:", e);
            }
        }
        for (edu.njtu.model.ori.User oriUser : usersList) {
            List<String> friends = oriUser.getFriends();
            List<String> elites = oriUser.getElite();

            for (String friendName : friends) {

                //根据  userid作为beuserid查询已经被别人加为好友
                //如果没有就查询该好友,并insert
                FriendExample friendExample = new FriendExample();
                FriendExample.Criteria criteria = friendExample.createCriteria();
                criteria.andBeUserIdEqualTo(oriUser.getUserId()).andUserNameEqualTo(friendName);
                List<Friend> beFriends = friendMapper.selectByExample(friendExample);
                if (0 == beFriends.size()) {
                    Friend friend = new Friend();
                    friend.setId(StringUtil.getUUID());
                    friend.setUserId(oriUser.getUserId());
                    friend.setUserName(oriUser.getName());

//                    friend.setBeUserId(beFriends.get(0).getUserId());
                    friend.setBeUserName(friendName);
                    try {
                        friendMapper.insertSelective(friend);
                    } catch (Exception e) {
                        logger.error("friend insert:", e);
                    }
                }
            }

            for (String year : elites) {
                Elite elite = new Elite();
                elite.setUserId(oriUser.getUserId());
                elite.setId(StringUtil.getUUID());
                elite.setYear(year);
                try {
                    eliteMapper.insertSelective(elite);
                } catch (Exception e) {
                    logger.error("friend insert:", e);
                }
            }
        }


    }
    private void insertBusinessRelatedTable(List<String> jsonList) {
        List<edu.njtu.model.ori.Business> businessOriList = jsonList.stream().map(s -> {
            return JSONObject.parseObject(s, edu.njtu.model.ori.Business.class);
        }).collect(Collectors.toList());
        //先存入所有business, 后面邻居等表数据需要用到
        for (Business businessOri : businessOriList) {

            try {
                edu.njtu.model.Business fatherBus = businessOri;
                businessMapper.insertSelective(fatherBus);
            } catch (Exception e) {
                logger.error("business",e);
            }
        }


        //开启事务
        for (edu.njtu.model.ori.Business businessOri : businessOriList) {
            Attributes attributesOri = businessOri.getAttributes();
            Attribute attribute = attributesOri;


            try {
                if (null != attribute) {
                    attribute.setBusinessId(businessOri.getBusinessId());
                    attributeMapper.insertSelective(attribute);

                    Ambience ambience = attributesOri.getAmbience();
                    if (null != ambience) {
                        ambience.setBusinessId(businessOri.getBusinessId());
                        ambienceMapper.insertSelective(ambience);
                    }


                    DietaryRestrictions dietaryRestrictions = attributesOri.getDietaryRestrictions();
                    if (null != dietaryRestrictions) {
                        dietaryRestrictions.setBusinessId(businessOri.getBusinessId());
                        dietaryRestrictionsMapper.insertSelective(dietaryRestrictions);
                    }

                    GoodFor goodFor = attributesOri.getGoodFor();
                    if (null != goodFor) {
                        goodFor.setBusinessId(businessOri.getBusinessId());
                        goodForMapper.insertSelective(goodFor);
                    }

                    HairTypesSpecializedIn hairTypesSpecializedIn = attributesOri.getHairTypesSpecializedIn();
                    if (null != hairTypesSpecializedIn) {
                        hairTypesSpecializedIn.setBusinessId(businessOri.getBusinessId());
                        hairTypesSpecializedInMapper.insertSelective(hairTypesSpecializedIn);
                    }

                    edu.njtu.model.ori.Hours hoursOri = businessOri.getHours();
                    if (null != hoursOri) {
                        edu.njtu.model.Hours hours = new edu.njtu.model.Hours();
                        if (null != hours) {
                            weekTransfer(hoursOri, hours);
                            hours.setBusinessId(businessOri.getBusinessId());
                            hoursMapper.insertSelective(hours);
                        }
                    }


                    Music music = attributesOri.getMusic();
                    if (null != music) {
                        music.setBusinessId(businessOri.getBusinessId());
                        musicMapper.insertSelective(music);
                    }

                    Parking parking = attributesOri.getParking();
                    if (null != parking) {
                        parking.setBusinessId(businessOri.getBusinessId());
                        parkingMapper.insertSelective(parking);

                    }

                    List<String> categoriesStr = businessOri.getCategories();
                    List<String> neighborhoods = businessOri.getNeighborhoods();

                    for (String categoryStr : categoriesStr) {
                        //方法1;查询是否存在该名称的category
                        //不存在则生成id,构造实体类,插入记录,并返回id
                        //在分类与商户中间表插入
                        //方法2:通过spark插入所有的category数据(去重)

                        CategoriesExample categoriesExample = new CategoriesExample();
                        categoriesExample.createCriteria().andNameEqualTo(categoryStr);
                        List<Categories> categoriesList = categoriesMapper.selectByExample(categoriesExample);
                        String categoriesId = "";
                        if (categoriesList.size() == 0) {
                            Categories categories = new Categories();
                            categories.setName(categoryStr);

                            //TODO 填入  id
                            categoriesId = StringUtil.getUUID();
                            categories.setId(categoriesId);
                            categoriesMapper.insertSelective(categories);
                        }else{
                            categoriesId = categoriesList.get(0).getId();
                        }


                        BusMidCategory busMidCategory = new BusMidCategory();
                        busMidCategory.setBusinessId(businessOri.getBusinessId());
                        busMidCategory.setCategoryId(categoriesId);
                        busMidCategory.setName(categoryStr);
                        busMidCategory.setId(StringUtil.getUUID());

                        busMidCategoryMapper.insertSelective(busMidCategory);
                    }



                    for (String neighborhoodStr : neighborhoods) {
                        //根据邻居的名称,查询该邻居的id
                        //构造对象,插入邻居表
                        BusinessExample businessExample = new BusinessExample();
                        businessExample.createCriteria().andNameEqualTo(neighborhoodStr);
                        List<edu.njtu.model.Business> businessesList = businessMapper.selectByExample(businessExample);


                        Neighborhood neighborhood  = new Neighborhood();
                        if (0 != businessesList.size()) {
                            String beNeighborhoodId = businessesList.get(0).getBusinessId();
                            neighborhood.setNeighborhoodId(beNeighborhoodId);
                        }
                        neighborhood.setBusinessId(businessOri.getBusinessId());
                        //TODO id
                        neighborhood.setId(StringUtil.getUUID());
                        neighborhood.setName(neighborhoodStr);

                        neighborhoodMapper.insertSelective(neighborhood);
                    }
                }
            } catch (Exception e) {
                logger.error("business relative",e);
            }

        }
    }

    private void weekTransfer(edu.njtu.model.ori.Hours hoursOri, edu.njtu.model.Hours hours) {
        if(null != hoursOri.getMonday()){
            if(StringUtils.isNotBlank(hoursOri.getMonday().getOpen())){
                hours.setMondayOpen(hoursOri.getMonday().getOpen());
            }
            if(StringUtils.isNotBlank(hoursOri.getMonday().getClose())){
                hours.setMondayClose(hoursOri.getMonday().getClose());
            }

        }
        if(null != hoursOri.getTuesday()){
            if(StringUtils.isNotBlank(hoursOri.getTuesday().getOpen())){
                hours.setTuesdayOpen(hoursOri.getTuesday().getOpen());
            }
            if(StringUtils.isNotBlank(hoursOri.getTuesday().getClose())){
                hours.setTuesdayClose(hoursOri.getTuesday().getClose());
            }

        }
        if(null != hoursOri.getWednesday()){
            if(StringUtils.isNotBlank(hoursOri.getWednesday().getOpen())){
                hours.setWednesdayOpen(hoursOri.getWednesday().getOpen());
            }
            if(StringUtils.isNotBlank(hoursOri.getWednesday().getClose())){
                hours.setWednesdayClose(hoursOri.getWednesday().getClose());
            }

        }
        if(null != hoursOri.getThursday()){
            if(StringUtils.isNotBlank(hoursOri.getThursday().getOpen())){
                hours.setThursdayOpen(hoursOri.getThursday().getOpen());
            }
            if(StringUtils.isNotBlank(hoursOri.getThursday().getClose())){
                hours.setThursdayClose(hoursOri.getThursday().getClose());
            }

        }
        if(null != hoursOri.getFriday()){
            if(StringUtils.isNotBlank(hoursOri.getFriday().getOpen())){
                hours.setFridayOpen(hoursOri.getFriday().getOpen());
            }
            if(StringUtils.isNotBlank(hoursOri.getFriday().getClose())){
                hours.setFridayClose(hoursOri.getFriday().getClose());
            }

        }
        if(null != hoursOri.getSaturday()){
            if(StringUtils.isNotBlank(hoursOri.getSaturday().getOpen())){
                hours.setSaturdayOpen(hoursOri.getSaturday().getOpen());
            }
            if(StringUtils.isNotBlank(hoursOri.getSaturday().getClose())){
                hours.setSaturdayClose(hoursOri.getSaturday().getClose());
            }

        }
        if(null != hoursOri.getSunday()){
            if(StringUtils.isNotBlank(hoursOri.getSunday().getOpen())){
                hours.setSundayOpen(hoursOri.getSunday().getOpen());
            }
            if(StringUtils.isNotBlank(hoursOri.getSunday().getClose())){
                hours.setSundayClose(hoursOri.getSunday().getClose());
            }

        }
    }

    public static  List<String> toArrayByFileReader1(String name) {
        // 使用ArrayList来存储每行读取到的字符串
        List<String> arrayList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(name);
            BufferedReader bf = new BufferedReader(fr);
            String str;
            // 按行读取字符串
            while ((str = bf.readLine()) != null) {
                arrayList.add(str);
            }
            bf.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 返回数组
        return arrayList;
    }
}
