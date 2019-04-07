package edu.njtu.model;

public class HairTypesSpecializedIn {
    private String businessId;

    private Boolean africanamerican;

    private Boolean asian;

    private Boolean coloring;

    private Boolean curly;

    private Boolean extensions;

    private Boolean kids;

    private Boolean perms;

    private Boolean straightperms;

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public Boolean getAfricanamerican() {
        return africanamerican;
    }

    public void setAfricanamerican(Boolean africanamerican) {
        this.africanamerican = africanamerican;
    }

    public Boolean getAsian() {
        return asian;
    }

    public void setAsian(Boolean asian) {
        this.asian = asian;
    }

    public Boolean getColoring() {
        return coloring;
    }

    public void setColoring(Boolean coloring) {
        this.coloring = coloring;
    }

    public Boolean getCurly() {
        return curly;
    }

    public void setCurly(Boolean curly) {
        this.curly = curly;
    }

    public Boolean getExtensions() {
        return extensions;
    }

    public void setExtensions(Boolean extensions) {
        this.extensions = extensions;
    }

    public Boolean getKids() {
        return kids;
    }

    public void setKids(Boolean kids) {
        this.kids = kids;
    }

    public Boolean getPerms() {
        return perms;
    }

    public void setPerms(Boolean perms) {
        this.perms = perms;
    }

    public Boolean getStraightperms() {
        return straightperms;
    }

    public void setStraightperms(Boolean straightperms) {
        this.straightperms = straightperms;
    }
}