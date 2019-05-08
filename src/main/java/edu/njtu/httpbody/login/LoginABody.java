package edu.njtu.httpbody.login;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class LoginABody {
    @ApiModelProperty(value="用户名",required=true,dataType="String",name="userName",example="0",allowableValues = "29073,89175,87070")
    private String userName;
    @ApiModelProperty(value="密码",required=true,dataType="String",name="password",example="password",allowableValues = "123456")
    private String password;
    @ApiModelProperty(value="Token",required=false,dataType="String",name="token",example="0",allowableValues = "0,1,2,3,4,5")
    private String token;
    @ApiModelProperty(value="操作类型",required=false,dataType="String",name="optType",example="0",allowableValues = "0,1,2,3,4,5")
    private String optType;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
