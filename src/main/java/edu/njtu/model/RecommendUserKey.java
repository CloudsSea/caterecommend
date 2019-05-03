package edu.njtu.model;

public class RecommendUserKey {
    private Long businessIdInt;

    private Long userIdInt;

    public Long getBusinessIdInt() {
        return businessIdInt;
    }

    public void setBusinessIdInt(Long businessIdInt) {
        this.businessIdInt = businessIdInt;
    }

    public Long getUserIdInt() {
        return userIdInt;
    }

    public void setUserIdInt(Long userIdInt) {
        this.userIdInt = userIdInt;
    }

    @Override
    public String toString() {
        return "RecommendUserKey{" +
                "businessIdInt=" + businessIdInt +
                ", userIdInt=" + userIdInt +
                '}';
    }
}