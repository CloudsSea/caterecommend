package edu.njtu.model;

public class BusinessKey {
    private Long businessIdInt;

    private String businessId;

    public Long getBusinessIdInt() {
        return businessIdInt;
    }

    public void setBusinessIdInt(Long businessIdInt) {
        this.businessIdInt = businessIdInt;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }
}