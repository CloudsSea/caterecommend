package edu.njtu.model;

public class RecommendDefault {
    private String businessId;

    private Long businessIdInt;

    private Float recommendValue;

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public Long getBusinessIdInt() {
        return businessIdInt;
    }

    public void setBusinessIdInt(Long businessIdInt) {
        this.businessIdInt = businessIdInt;
    }

    public Float getRecommendValue() {
        return recommendValue;
    }

    public void setRecommendValue(Float recommendValue) {
        this.recommendValue = recommendValue;
    }
}