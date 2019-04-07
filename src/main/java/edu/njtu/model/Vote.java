package edu.njtu.model;

public class Vote {
    private String id;

    private String userId;

    private String userName;

    private String beReviewId;

    private String businessId;

    private Boolean cool;

    private Boolean funny;

    private Boolean useful;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getBeReviewId() {
        return beReviewId;
    }

    public void setBeReviewId(String beReviewId) {
        this.beReviewId = beReviewId == null ? null : beReviewId.trim();
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public Boolean getCool() {
        return cool;
    }

    public void setCool(Boolean cool) {
        this.cool = cool;
    }

    public Boolean getFunny() {
        return funny;
    }

    public void setFunny(Boolean funny) {
        this.funny = funny;
    }

    public Boolean getUseful() {
        return useful;
    }

    public void setUseful(Boolean useful) {
        this.useful = useful;
    }
}