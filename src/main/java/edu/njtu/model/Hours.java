package edu.njtu.model;

public class Hours {
    private String businessId;

    private String mondayOpen;

    private String mondayClose;

    private String thursdayOpen;

    private String thursdayClose;

    private String wednesdayOpen;

    private String wednesdayClose;

    private String saturdayOpen;

    private String saturdayClose;

    private String fridayOpen;

    private String fridayClose;

    private String tuesdayOpen;

    private String tuesdayClose;

    private String sundayOpen;

    private String sundayClose;

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public String getMondayOpen() {
        return mondayOpen;
    }

    public void setMondayOpen(String mondayOpen) {
        this.mondayOpen = mondayOpen == null ? null : mondayOpen.trim();
    }

    public String getMondayClose() {
        return mondayClose;
    }

    public void setMondayClose(String mondayClose) {
        this.mondayClose = mondayClose == null ? null : mondayClose.trim();
    }

    public String getThursdayOpen() {
        return thursdayOpen;
    }

    public void setThursdayOpen(String thursdayOpen) {
        this.thursdayOpen = thursdayOpen == null ? null : thursdayOpen.trim();
    }

    public String getThursdayClose() {
        return thursdayClose;
    }

    public void setThursdayClose(String thursdayClose) {
        this.thursdayClose = thursdayClose == null ? null : thursdayClose.trim();
    }

    public String getWednesdayOpen() {
        return wednesdayOpen;
    }

    public void setWednesdayOpen(String wednesdayOpen) {
        this.wednesdayOpen = wednesdayOpen == null ? null : wednesdayOpen.trim();
    }

    public String getWednesdayClose() {
        return wednesdayClose;
    }

    public void setWednesdayClose(String wednesdayClose) {
        this.wednesdayClose = wednesdayClose == null ? null : wednesdayClose.trim();
    }

    public String getSaturdayOpen() {
        return saturdayOpen;
    }

    public void setSaturdayOpen(String saturdayOpen) {
        this.saturdayOpen = saturdayOpen == null ? null : saturdayOpen.trim();
    }

    public String getSaturdayClose() {
        return saturdayClose;
    }

    public void setSaturdayClose(String saturdayClose) {
        this.saturdayClose = saturdayClose == null ? null : saturdayClose.trim();
    }

    public String getFridayOpen() {
        return fridayOpen;
    }

    public void setFridayOpen(String fridayOpen) {
        this.fridayOpen = fridayOpen == null ? null : fridayOpen.trim();
    }

    public String getFridayClose() {
        return fridayClose;
    }

    public void setFridayClose(String fridayClose) {
        this.fridayClose = fridayClose == null ? null : fridayClose.trim();
    }

    public String getTuesdayOpen() {
        return tuesdayOpen;
    }

    public void setTuesdayOpen(String tuesdayOpen) {
        this.tuesdayOpen = tuesdayOpen == null ? null : tuesdayOpen.trim();
    }

    public String getTuesdayClose() {
        return tuesdayClose;
    }

    public void setTuesdayClose(String tuesdayClose) {
        this.tuesdayClose = tuesdayClose == null ? null : tuesdayClose.trim();
    }

    public String getSundayOpen() {
        return sundayOpen;
    }

    public void setSundayOpen(String sundayOpen) {
        this.sundayOpen = sundayOpen == null ? null : sundayOpen.trim();
    }

    public String getSundayClose() {
        return sundayClose;
    }

    public void setSundayClose(String sundayClose) {
        this.sundayClose = sundayClose == null ? null : sundayClose.trim();
    }

    @Override
    public String toString() {
        return "Hours{" +
                "businessId='" + businessId + '\'' +
                ", mondayOpen='" + mondayOpen + '\'' +
                ", mondayClose='" + mondayClose + '\'' +
                ", thursdayOpen='" + thursdayOpen + '\'' +
                ", thursdayClose='" + thursdayClose + '\'' +
                ", wednesdayOpen='" + wednesdayOpen + '\'' +
                ", wednesdayClose='" + wednesdayClose + '\'' +
                ", saturdayOpen='" + saturdayOpen + '\'' +
                ", saturdayClose='" + saturdayClose + '\'' +
                ", fridayOpen='" + fridayOpen + '\'' +
                ", fridayClose='" + fridayClose + '\'' +
                ", tuesdayOpen='" + tuesdayOpen + '\'' +
                ", tuesdayClose='" + tuesdayClose + '\'' +
                ", sundayOpen='" + sundayOpen + '\'' +
                ", sundayClose='" + sundayClose + '\'' +
                '}';
    }
}