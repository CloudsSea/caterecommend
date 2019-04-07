package edu.njtu.model;

public class Friend {
    private String id;

    private String userId;

    private String userName;

    private String beUserId;

    private String beUserName;

    private String createTime;

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

    public String getBeUserId() {
        return beUserId;
    }

    public void setBeUserId(String beUserId) {
        this.beUserId = beUserId == null ? null : beUserId.trim();
    }

    public String getBeUserName() {
        return beUserName;
    }

    public void setBeUserName(String beUserName) {
        this.beUserName = beUserName == null ? null : beUserName.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }
}