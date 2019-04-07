package edu.njtu.model;

public class GoodFor {
    private String businessId;

    private Boolean breakfast;

    private Boolean brunch;

    private Boolean dessert;

    private Boolean dinner;

    private Boolean latenight;

    private Boolean lunch;

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public Boolean getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(Boolean breakfast) {
        this.breakfast = breakfast;
    }

    public Boolean getBrunch() {
        return brunch;
    }

    public void setBrunch(Boolean brunch) {
        this.brunch = brunch;
    }

    public Boolean getDessert() {
        return dessert;
    }

    public void setDessert(Boolean dessert) {
        this.dessert = dessert;
    }

    public Boolean getDinner() {
        return dinner;
    }

    public void setDinner(Boolean dinner) {
        this.dinner = dinner;
    }

    public Boolean getLatenight() {
        return latenight;
    }

    public void setLatenight(Boolean latenight) {
        this.latenight = latenight;
    }

    public Boolean getLunch() {
        return lunch;
    }

    public void setLunch(Boolean lunch) {
        this.lunch = lunch;
    }

    @Override
    public String toString() {
        return "GoodFor{" +
                "businessId='" + businessId + '\'' +
                ", breakfast=" + breakfast +
                ", brunch=" + brunch +
                ", dessert=" + dessert +
                ", dinner=" + dinner +
                ", latenight=" + latenight +
                ", lunch=" + lunch +
                '}';
    }
}