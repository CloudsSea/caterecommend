package edu.njtu.model;

public class Ambience {
    private String businessId;

    private Boolean casual;

    private Boolean classy;

    private Boolean divey;

    private Boolean hipster;

    private Boolean intimate;

    private Boolean romantic;

    private Boolean touristy;

    private Boolean trendy;

    private Boolean upscale;

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public Boolean getCasual() {
        return casual;
    }

    public void setCasual(Boolean casual) {
        this.casual = casual;
    }

    public Boolean getClassy() {
        return classy;
    }

    public void setClassy(Boolean classy) {
        this.classy = classy;
    }

    public Boolean getDivey() {
        return divey;
    }

    public void setDivey(Boolean divey) {
        this.divey = divey;
    }

    public Boolean getHipster() {
        return hipster;
    }

    public void setHipster(Boolean hipster) {
        this.hipster = hipster;
    }

    public Boolean getIntimate() {
        return intimate;
    }

    public void setIntimate(Boolean intimate) {
        this.intimate = intimate;
    }

    public Boolean getRomantic() {
        return romantic;
    }

    public void setRomantic(Boolean romantic) {
        this.romantic = romantic;
    }

    public Boolean getTouristy() {
        return touristy;
    }

    public void setTouristy(Boolean touristy) {
        this.touristy = touristy;
    }

    public Boolean getTrendy() {
        return trendy;
    }

    public void setTrendy(Boolean trendy) {
        this.trendy = trendy;
    }

    public Boolean getUpscale() {
        return upscale;
    }

    public void setUpscale(Boolean upscale) {
        this.upscale = upscale;
    }

    @Override
    public String toString() {
        return "Ambience{" +
                "businessId='" + businessId + '\'' +
                ", casual=" + casual +
                ", classy=" + classy +
                ", divey=" + divey +
                ", hipster=" + hipster +
                ", intimate=" + intimate +
                ", romantic=" + romantic +
                ", touristy=" + touristy +
                ", trendy=" + trendy +
                ", upscale=" + upscale +
                '}';
    }
}