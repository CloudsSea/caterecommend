package edu.njtu.service.impl;

import edu.njtu.httpbody.restaurant.*;
import edu.njtu.service.RestaurantService;
import org.springframework.stereotype.Service;

@Service("restaurantService")
public class RestaurantServiceImpl implements RestaurantService {

    @Override
    public RestaurantListDBody getRestaurantList(RestaurantListABody restaurantListABody) {
        return null;
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
