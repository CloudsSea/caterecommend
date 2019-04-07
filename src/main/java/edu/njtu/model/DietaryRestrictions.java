package edu.njtu.model;

public class DietaryRestrictions {
    private String businessId;

    private Boolean dairyFree;

    private Boolean glutenFree;

    private Boolean halal;

    private Boolean kosher;

    private Boolean soyFree;

    private Boolean vegan;

    private Boolean vegetarian;

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public Boolean getDairyFree() {
        return dairyFree;
    }

    public void setDairyFree(Boolean dairyFree) {
        this.dairyFree = dairyFree;
    }

    public Boolean getGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(Boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    public Boolean getHalal() {
        return halal;
    }

    public void setHalal(Boolean halal) {
        this.halal = halal;
    }

    public Boolean getKosher() {
        return kosher;
    }

    public void setKosher(Boolean kosher) {
        this.kosher = kosher;
    }

    public Boolean getSoyFree() {
        return soyFree;
    }

    public void setSoyFree(Boolean soyFree) {
        this.soyFree = soyFree;
    }

    public Boolean getVegan() {
        return vegan;
    }

    public void setVegan(Boolean vegan) {
        this.vegan = vegan;
    }

    public Boolean getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(Boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    @Override
    public String toString() {
        return "DietaryRestrictions{" +
                "businessId='" + businessId + '\'' +
                ", dairyFree=" + dairyFree +
                ", glutenFree=" + glutenFree +
                ", halal=" + halal +
                ", kosher=" + kosher +
                ", soyFree=" + soyFree +
                ", vegan=" + vegan +
                ", vegetarian=" + vegetarian +
                '}';
    }
}