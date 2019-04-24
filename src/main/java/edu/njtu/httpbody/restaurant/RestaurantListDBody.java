package edu.njtu.httpbody.restaurant;

import edu.njtu.httpbody.PageDBody;
import edu.njtu.model.Business;

import java.util.List;

public class RestaurantListDBody extends PageDBody {
    private List<Business> businessList;

    public List<Business> getBusinessList() {
        return businessList;
    }

    public void setBusinessList(List<Business> businessList) {
        this.businessList = businessList;
    }
}
