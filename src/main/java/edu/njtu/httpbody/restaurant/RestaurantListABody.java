package edu.njtu.httpbody.restaurant;

import edu.njtu.httpbody.PageABody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class RestaurantListABody extends PageABody {
    @ApiModelProperty(value="操作类型",required=false,dataType="Integer",name="optType",example="0",allowableValues = "0,1,2,3,4,5")
    private Integer optType;
//    @ApiModelProperty(value="用户id",required=false,dataType="String",name="userId",example="-Gu3ZZ8FLVxomzlQ98BIBQ",allowableValues = "-Gu3ZZ8FLVxomzlQ98BIBQ,LOGz9_JwuJtGi8PyzAiCg")
//    private String userId;

    public Integer getOptType() {
        return optType;
    }

    public void setOptType(Integer optType) {
        this.optType = optType;
    }

//    public String getUserId() {
//        return userId;
//    }
//
//    public void setUserId(String userId) {
//        this.userId = userId;
//    }
}
