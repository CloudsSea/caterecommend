package edu.njtu.httpbody;

import java.io.Serializable;

public class PageDBody extends CommonDBody implements Serializable {
    private Integer pageNumber = Integer.valueOf(1);
    private Integer pageSize = Integer.valueOf(10);
    private Integer total;

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
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
