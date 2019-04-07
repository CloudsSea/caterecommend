package edu.njtu.model;

public class Attribute {
    private String businessId;

    private Boolean acceptsCreditCards;

    private Boolean acceptsInsurance;

    private String agesAllowed;

    private String alcohol;

    private String attire;

    private Boolean byob;

    private String byobCorkage;

    private Boolean byAppointmentOnly;

    private Boolean caters;

    private Boolean coatCheck;

    private Boolean corkage;

    private Boolean delivery;

    private Boolean dogsAllowed;

    private Boolean driveThru;

    private Boolean goodForDancing;

    private Boolean goodForGroups;

    private Boolean goodForKids;

    private Boolean happyHour;

    private Boolean hasTv;

    private String noiseLevel;

    private Boolean open24Hours;

    private Boolean orderAtCounter;

    private Boolean outdoorSeating;

    private Boolean priceRange;

    private String smoking;

    private Boolean takeOut;

    private Boolean takesReservations;

    private Boolean waiterService;

    private Boolean wheelchairAccessible;

    private String wiFi;

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public Boolean getAcceptsCreditCards() {
        return acceptsCreditCards;
    }

    public void setAcceptsCreditCards(Boolean acceptsCreditCards) {
        this.acceptsCreditCards = acceptsCreditCards;
    }

    public Boolean getAcceptsInsurance() {
        return acceptsInsurance;
    }

    public void setAcceptsInsurance(Boolean acceptsInsurance) {
        this.acceptsInsurance = acceptsInsurance;
    }

    public String getAgesAllowed() {
        return agesAllowed;
    }

    public void setAgesAllowed(String agesAllowed) {
        this.agesAllowed = agesAllowed == null ? null : agesAllowed.trim();
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol == null ? null : alcohol.trim();
    }

    public String getAttire() {
        return attire;
    }

    public void setAttire(String attire) {
        this.attire = attire == null ? null : attire.trim();
    }

    public Boolean getByob() {
        return byob;
    }

    public void setByob(Boolean byob) {
        this.byob = byob;
    }

    public String getByobCorkage() {
        return byobCorkage;
    }

    public void setByobCorkage(String byobCorkage) {
        this.byobCorkage = byobCorkage == null ? null : byobCorkage.trim();
    }

    public Boolean getByAppointmentOnly() {
        return byAppointmentOnly;
    }

    public void setByAppointmentOnly(Boolean byAppointmentOnly) {
        this.byAppointmentOnly = byAppointmentOnly;
    }

    public Boolean getCaters() {
        return caters;
    }

    public void setCaters(Boolean caters) {
        this.caters = caters;
    }

    public Boolean getCoatCheck() {
        return coatCheck;
    }

    public void setCoatCheck(Boolean coatCheck) {
        this.coatCheck = coatCheck;
    }

    public Boolean getCorkage() {
        return corkage;
    }

    public void setCorkage(Boolean corkage) {
        this.corkage = corkage;
    }

    public Boolean getDelivery() {
        return delivery;
    }

    public void setDelivery(Boolean delivery) {
        this.delivery = delivery;
    }

    public Boolean getDogsAllowed() {
        return dogsAllowed;
    }

    public void setDogsAllowed(Boolean dogsAllowed) {
        this.dogsAllowed = dogsAllowed;
    }

    public Boolean getDriveThru() {
        return driveThru;
    }

    public void setDriveThru(Boolean driveThru) {
        this.driveThru = driveThru;
    }

    public Boolean getGoodForDancing() {
        return goodForDancing;
    }

    public void setGoodForDancing(Boolean goodForDancing) {
        this.goodForDancing = goodForDancing;
    }

    public Boolean getGoodForGroups() {
        return goodForGroups;
    }

    public void setGoodForGroups(Boolean goodForGroups) {
        this.goodForGroups = goodForGroups;
    }

    public Boolean getGoodForKids() {
        return goodForKids;
    }

    public void setGoodForKids(Boolean goodForKids) {
        this.goodForKids = goodForKids;
    }

    public Boolean getHappyHour() {
        return happyHour;
    }

    public void setHappyHour(Boolean happyHour) {
        this.happyHour = happyHour;
    }

    public Boolean getHasTv() {
        return hasTv;
    }

    public void setHasTv(Boolean hasTv) {
        this.hasTv = hasTv;
    }

    public String getNoiseLevel() {
        return noiseLevel;
    }

    public void setNoiseLevel(String noiseLevel) {
        this.noiseLevel = noiseLevel == null ? null : noiseLevel.trim();
    }

    public Boolean getOpen24Hours() {
        return open24Hours;
    }

    public void setOpen24Hours(Boolean open24Hours) {
        this.open24Hours = open24Hours;
    }

    public Boolean getOrderAtCounter() {
        return orderAtCounter;
    }

    public void setOrderAtCounter(Boolean orderAtCounter) {
        this.orderAtCounter = orderAtCounter;
    }

    public Boolean getOutdoorSeating() {
        return outdoorSeating;
    }

    public void setOutdoorSeating(Boolean outdoorSeating) {
        this.outdoorSeating = outdoorSeating;
    }

    public Boolean getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(Boolean priceRange) {
        this.priceRange = priceRange;
    }

    public String getSmoking() {
        return smoking;
    }

    public void setSmoking(String smoking) {
        this.smoking = smoking == null ? null : smoking.trim();
    }

    public Boolean getTakeOut() {
        return takeOut;
    }

    public void setTakeOut(Boolean takeOut) {
        this.takeOut = takeOut;
    }

    public Boolean getTakesReservations() {
        return takesReservations;
    }

    public void setTakesReservations(Boolean takesReservations) {
        this.takesReservations = takesReservations;
    }

    public Boolean getWaiterService() {
        return waiterService;
    }

    public void setWaiterService(Boolean waiterService) {
        this.waiterService = waiterService;
    }

    public Boolean getWheelchairAccessible() {
        return wheelchairAccessible;
    }

    public void setWheelchairAccessible(Boolean wheelchairAccessible) {
        this.wheelchairAccessible = wheelchairAccessible;
    }

    public String getWiFi() {
        return wiFi;
    }

    public void setWiFi(String wiFi) {
        this.wiFi = wiFi == null ? null : wiFi.trim();
    }

    @Override
    public String toString() {
        return "Attribute{" +
                "businessId='" + businessId + '\'' +
                ", acceptsCreditCards=" + acceptsCreditCards +
                ", acceptsInsurance=" + acceptsInsurance +
                ", agesAllowed='" + agesAllowed + '\'' +
                ", alcohol='" + alcohol + '\'' +
                ", attire='" + attire + '\'' +
                ", byob=" + byob +
                ", byobCorkage='" + byobCorkage + '\'' +
                ", byAppointmentOnly=" + byAppointmentOnly +
                ", caters=" + caters +
                ", coatCheck=" + coatCheck +
                ", corkage=" + corkage +
                ", delivery=" + delivery +
                ", dogsAllowed=" + dogsAllowed +
                ", driveThru=" + driveThru +
                ", goodForDancing=" + goodForDancing +
                ", goodForGroups=" + goodForGroups +
                ", goodForKids=" + goodForKids +
                ", happyHour=" + happyHour +
                ", hasTv=" + hasTv +
                ", noiseLevel='" + noiseLevel + '\'' +
                ", open24Hours=" + open24Hours +
                ", orderAtCounter=" + orderAtCounter +
                ", outdoorSeating=" + outdoorSeating +
                ", priceRange=" + priceRange +
                ", smoking='" + smoking + '\'' +
                ", takeOut=" + takeOut +
                ", takesReservations=" + takesReservations +
                ", waiterService=" + waiterService +
                ", wheelchairAccessible=" + wheelchairAccessible +
                ", wiFi='" + wiFi + '\'' +
                '}';
    }
}