package edu.njtu.model.ori;

import edu.njtu.model.*;

public class Attributes extends Attribute{

    private Ambience ambience;
    private DietaryRestrictions dietaryRestrictions;
    private GoodFor goodFor;
    private Music music;
    private Parking parking;
    private HairTypesSpecializedIn hairTypesSpecializedIn;

    public Attributes() {
        super();
    }

    public Ambience getAmbience() {
        return ambience;
    }

    public void setAmbience(Ambience ambience) {
        this.ambience = ambience;
    }

    public DietaryRestrictions getDietaryRestrictions() {
        return dietaryRestrictions;
    }

    public void setDietaryRestrictions(DietaryRestrictions dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
    }

    public GoodFor getGoodFor() {
        return goodFor;
    }

    public void setGoodFor(GoodFor goodFor) {
        this.goodFor = goodFor;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public Parking getParking() {
        return parking;
    }

    public void setParking(Parking parking) {
        this.parking = parking;
    }

    public HairTypesSpecializedIn getHairTypesSpecializedIn() {
        return hairTypesSpecializedIn;
    }

    public void setHairTypesSpecializedIn(HairTypesSpecializedIn hairTypesSpecializedIn) {
        this.hairTypesSpecializedIn = hairTypesSpecializedIn;
    }
}