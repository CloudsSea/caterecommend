package edu.njtu.httpbody;

import java.io.Serializable;

public class PageDBody extends CommonDBody implements Serializable {
    private Integer pageNo = Integer.valueOf(1);
    private Integer pageSize = Integer.valueOf(10);
    private Integer total;

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

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
