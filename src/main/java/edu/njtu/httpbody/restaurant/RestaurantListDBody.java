package edu.njtu.httpbody.restaurant;

import edu.njtu.httpbody.PageDBody;
import edu.njtu.model.Business;

import java.util.List;

public class RestaurantListDBody extends PageDBody {
    private List<Business> businessList;
    private List<Business> businessUserRecommendList;
    private List<Business> businessDefaultRecommendList;

    public List<Business> getBusinessList() {
        return businessList;
    }

    public void setBusinessList(List<Business> businessList) {
        this.businessList = businessList;
    }

    public List<Business> getBusinessUserRecommendList() {
        return businessUserRecommendList;
    }

    public void setBusinessUserRecommendList(List<Business> businessUserRecommendList) {
        this.businessUserRecommendList = businessUserRecommendList;
    }

    public List<Business> getBusinessDefaultRecommendList() {
        return businessDefaultRecommendList;
    }

    public void setBusinessDefaultRecommendList(List<Business> businessDefaultRecommendList) {
        this.businessDefaultRecommendList = businessDefaultRecommendList;
    }
}
