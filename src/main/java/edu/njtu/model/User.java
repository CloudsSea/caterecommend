package edu.njtu.model;

import java.util.Date;

public class User {
    private String id;

    private String name;

    private Integer reviewCount;

    private Date yelpingSince;

    private Integer useful;

    private Integer funny;

    private Integer cool;

    private Integer fans;

    private Float averageStars;

    private Integer complimentHot;

    private Integer complimentMore;

    private Integer complimentProfile;

    private Integer complimentCute;

    private Integer complimentList;

    private Integer complimentNote;

    private Integer complimentPlain;

    private Integer complimentCool;

    private Integer complimentFunny;

    private Integer complimentWriter;

    private Integer complimentPhotos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    public Date getYelpingSince() {
        return yelpingSince;
    }

    public void setYelpingSince(Date yelpingSince) {
        this.yelpingSince = yelpingSince;
    }

    public Integer getUseful() {
        return useful;
    }

    public void setUseful(Integer useful) {
        this.useful = useful;
    }

    public Integer getFunny() {
        return funny;
    }

    public void setFunny(Integer funny) {
        this.funny = funny;
    }

    public Integer getCool() {
        return cool;
    }

    public void setCool(Integer cool) {
        this.cool = cool;
    }

    public Integer getFans() {
        return fans;
    }

    public void setFans(Integer fans) {
        this.fans = fans;
    }

    public Float getAverageStars() {
        return averageStars;
    }

    public void setAverageStars(Float averageStars) {
        this.averageStars = averageStars;
    }

    public Integer getComplimentHot() {
        return complimentHot;
    }

    public void setComplimentHot(Integer complimentHot) {
        this.complimentHot = complimentHot;
    }

    public Integer getComplimentMore() {
        return complimentMore;
    }

    public void setComplimentMore(Integer complimentMore) {
        this.complimentMore = complimentMore;
    }

    public Integer getComplimentProfile() {
        return complimentProfile;
    }

    public void setComplimentProfile(Integer complimentProfile) {
        this.complimentProfile = complimentProfile;
    }

    public Integer getComplimentCute() {
        return complimentCute;
    }

    public void setComplimentCute(Integer complimentCute) {
        this.complimentCute = complimentCute;
    }

    public Integer getComplimentList() {
        return complimentList;
    }

    public void setComplimentList(Integer complimentList) {
        this.complimentList = complimentList;
    }

    public Integer getComplimentNote() {
        return complimentNote;
    }

    public void setComplimentNote(Integer complimentNote) {
        this.complimentNote = complimentNote;
    }

    public Integer getComplimentPlain() {
        return complimentPlain;
    }

    public void setComplimentPlain(Integer complimentPlain) {
        this.complimentPlain = complimentPlain;
    }

    public Integer getComplimentCool() {
        return complimentCool;
    }

    public void setComplimentCool(Integer complimentCool) {
        this.complimentCool = complimentCool;
    }

    public Integer getComplimentFunny() {
        return complimentFunny;
    }

    public void setComplimentFunny(Integer complimentFunny) {
        this.complimentFunny = complimentFunny;
    }

    public Integer getComplimentWriter() {
        return complimentWriter;
    }

    public void setComplimentWriter(Integer complimentWriter) {
        this.complimentWriter = complimentWriter;
    }

    public Integer getComplimentPhotos() {
        return complimentPhotos;
    }

    public void setComplimentPhotos(Integer complimentPhotos) {
        this.complimentPhotos = complimentPhotos;
    }
}