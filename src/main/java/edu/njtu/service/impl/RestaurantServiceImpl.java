package edu.njtu.service.impl;

import edu.njtu.httpbody.restaurant.*;
import edu.njtu.mapper.BusinessMapper;
import edu.njtu.model.Business;
import edu.njtu.model.BusinessExample;
import edu.njtu.service.RestaurantService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("restaurantService")
public class RestaurantServiceImpl implements RestaurantService {

    @Resource
    private BusinessMapper businessMapper;

    @Override
    public RestaurantListDBody getRestaurantList(RestaurantListABody restaurantListABody) {
        List<Business> businessesList = businessMapper.selectByExample(new BusinessExample());
        RestaurantListDBody restaurantListDBody = new RestaurantListDBody();
        restaurantListDBody.setCode("10000");

        restaurantListDBody.setBusinessList(businessesList);
        return restaurantListDBody;
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
