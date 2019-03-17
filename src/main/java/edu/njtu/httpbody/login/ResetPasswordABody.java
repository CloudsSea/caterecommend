package edu.njtu.httpbody.login;

public class ResetPasswordABody {
    private String originPassword;
    private String newPassword;
    private String doublePassword;
    private String token;
    private String optType;

    public String getOriginPassword() {
        return originPassword;
    }

    public void setOriginPassword(String originPassword) {
        this.originPassword = originPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getDoublePassword() {
        return doublePassword;
    }

    public void setDoublePassword(String doublePassword) {
        this.doublePassword = doublePassword;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getOptType() {
        return optType;
    }

    public void setOptType(String optType) {
        this.optType = optType;
    }
}
