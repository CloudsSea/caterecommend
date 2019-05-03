package edu.njtu.model;

public class RecommendUser extends RecommendUserKey {
    private Float recommendValue;

    public Float getRecommendValue() {
        return recommendValue;
    }

    public void setRecommendValue(Float recommendValue) {
        this.recommendValue = recommendValue;
    }
}