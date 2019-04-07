package edu.njtu.model;

public class UserKey {
    private Long userIdInt;

    private String userId;

    public Long getUserIdInt() {
        return userIdInt;
    }

    public void setUserIdInt(Long userIdInt) {
        this.userIdInt = userIdInt;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}