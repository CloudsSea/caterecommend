package edu.njtu.service;

import edu.njtu.httpbody.restaurant.*;

import javax.servlet.http.HttpSession;

public interface RestaurantService {

    RestaurantListDBody getRestaurantList(RestaurantListABody restaurantListABody, HttpSession session) throws Exception;

    RestaurantInsertDBody restaurantInsert(RestaurantInsertABody restaurantInsertABody);

    RestaurantUpdateDBody restaurantUpdate(RestaurantUpdateABody restaurantUpdateABody);

    RestaurantDetailDBody restaurantDetail(RestaurantDetailABody restaurantDetailABody);
}
