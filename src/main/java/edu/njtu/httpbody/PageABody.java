package edu.njtu.httpbody;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class PageABody {
    @ApiModelProperty(value="页码",required=true,dataType="Integer",name="pageNo",example="1",allowableValues = "1,2")
    private Integer pageNo;
    @ApiModelProperty(value="单页大小",required=true,dataType="Integer",name="pageSize",example="10",allowableValues = "10,20")
    private Integer pageSize;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
