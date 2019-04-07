package edu.njtu.model;

public class Parking {
    private String businessId;

    private Boolean garage;

    private Boolean lot;

    private Boolean street;

    private Boolean valet;

    private Boolean validated;

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public Boolean getGarage() {
        return garage;
    }

    public void setGarage(Boolean garage) {
        this.garage = garage;
    }

    public Boolean getLot() {
        return lot;
    }

    public void setLot(Boolean lot) {
        this.lot = lot;
    }

    public Boolean getStreet() {
        return street;
    }

    public void setStreet(Boolean street) {
        this.street = street;
    }

    public Boolean getValet() {
        return valet;
    }

    public void setValet(Boolean valet) {
        this.valet = valet;
    }

    public Boolean getValidated() {
        return validated;
    }

    public void setValidated(Boolean validated) {
        this.validated = validated;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "businessId='" + businessId + '\'' +
                ", garage=" + garage +
                ", lot=" + lot +
                ", street=" + street +
                ", valet=" + valet +
                ", validated=" + validated +
                '}';
    }
}