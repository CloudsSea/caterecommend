package edu.njtu.controller;

import edu.njtu.httpbody.restaurant.*;
import edu.njtu.service.RestaurantService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Hai on 2019/3/15.
 */
@RequestMapping("/restaurant")
@Controller
@Api("餐馆api")
public class RestaurantController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    public RestaurantService restaurantService;

    @ApiOperation(value="获取餐馆列表")
    @ResponseBody
    @RequestMapping(value="/getlist",method= RequestMethod.GET)
    public RestaurantListDBody getRestaurantList(RestaurantListABody restaurantListABody, HttpSession session) {
        RestaurantListDBody restaurantListDBody = new RestaurantListDBody();
        try {
            restaurantListDBody= restaurantService.getRestaurantList(restaurantListABody,session);

        }catch (Exception e){
            logger.error("获取餐馆列表错误:",e);
            //FIXME  抽象出一个过滤器,捕捉错误
            restaurantListDBody.setCode("40000");
            restaurantListDBody.setMsg("获取餐馆列表错误");
            restaurantListDBody.setSubCode(e.getMessage());
            restaurantListDBody.setSubMsg(e.getMessage());
        }
        return restaurantListDBody;
    }

    @ResponseBody
    @RequestMapping(value="/detail",method= RequestMethod.GET)
    public RestaurantDetailDBody restaurantDetail(RestaurantDetailABody restaurantDetailABody) {
        RestaurantDetailDBody restaurantDetailDBody = restaurantService.restaurantDetail(restaurantDetailABody);
        return null;
    }

//    @ResponseBody
//    @RequestMapping(value="/insert")
//    public RestaurantInsertDBody restaurantInsert(RestaurantInsertABody restaurantInsertABody) {
//        RestaurantInsertDBody restaurantInsertDBody = restaurantService.restaurantInsert(restaurantInsertABody);
//        return null;
//    }
//
//    @ResponseBody
//    @RequestMapping(value="/update")
//    public RestaurantUpdateDBody restaurantUpdate(RestaurantUpdateABody restaurantUpdateABody) {
//        RestaurantUpdateDBody restaurantUpdateDBody =  restaurantService.restaurantUpdate(restaurantUpdateABody);
//        return null;
//    }

}

