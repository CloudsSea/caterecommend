package edu.njtu.model;

public class User extends UserKey {
    private Double averageStars;

    private Integer complimentsCool;

    private Integer complimentsCute;

    private Integer complimentsFunny;

    private Integer complimentsHot;

    private Integer complimentsList;

    private Integer complimentsMore;

    private Integer complimentsNote;

    private Integer complimentsPhotos;

    private Integer complimentsPlain;

    private Integer complimentsProfile;

    private Integer complimentsWriter;

    private Integer fans;

    private String name;

    private Integer reviewCount;

    private String type;

    private Integer votesCool;

    private Integer votesFunny;

    private Integer votesUseful;

    private String yelpingSince;

    public Double getAverageStars() {
        return averageStars;
    }

    public void setAverageStars(Double averageStars) {
        this.averageStars = averageStars;
    }

    public Integer getComplimentsCool() {
        return complimentsCool;
    }

    public void setComplimentsCool(Integer complimentsCool) {
        this.complimentsCool = complimentsCool;
    }

    public Integer getComplimentsCute() {
        return complimentsCute;
    }

    public void setComplimentsCute(Integer complimentsCute) {
        this.complimentsCute = complimentsCute;
    }

    public Integer getComplimentsFunny() {
        return complimentsFunny;
    }

    public void setComplimentsFunny(Integer complimentsFunny) {
        this.complimentsFunny = complimentsFunny;
    }

    public Integer getComplimentsHot() {
        return complimentsHot;
    }

    public void setComplimentsHot(Integer complimentsHot) {
        this.complimentsHot = complimentsHot;
    }

    public Integer getComplimentsList() {
        return complimentsList;
    }

    public void setComplimentsList(Integer complimentsList) {
        this.complimentsList = complimentsList;
    }

    public Integer getComplimentsMore() {
        return complimentsMore;
    }

    public void setComplimentsMore(Integer complimentsMore) {
        this.complimentsMore = complimentsMore;
    }

    public Integer getComplimentsNote() {
        return complimentsNote;
    }

    public void setComplimentsNote(Integer complimentsNote) {
        this.complimentsNote = complimentsNote;
    }

    public Integer getComplimentsPhotos() {
        return complimentsPhotos;
    }

    public void setComplimentsPhotos(Integer complimentsPhotos) {
        this.complimentsPhotos = complimentsPhotos;
    }

    public Integer getComplimentsPlain() {
        return complimentsPlain;
    }

    public void setComplimentsPlain(Integer complimentsPlain) {
        this.complimentsPlain = complimentsPlain;
    }

    public Integer getComplimentsProfile() {
        return complimentsProfile;
    }

    public void setComplimentsProfile(Integer complimentsProfile) {
        this.complimentsProfile = complimentsProfile;
    }

    public Integer getComplimentsWriter() {
        return complimentsWriter;
    }

    public void setComplimentsWriter(Integer complimentsWriter) {
        this.complimentsWriter = complimentsWriter;
    }

    public Integer getFans() {
        return fans;
    }

    public void setFans(Integer fans) {
        this.fans = fans;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getVotesCool() {
        return votesCool;
    }

    public void setVotesCool(Integer votesCool) {
        this.votesCool = votesCool;
    }

    public Integer getVotesFunny() {
        return votesFunny;
    }

    public void setVotesFunny(Integer votesFunny) {
        this.votesFunny = votesFunny;
    }

    public Integer getVotesUseful() {
        return votesUseful;
    }

    public void setVotesUseful(Integer votesUseful) {
        this.votesUseful = votesUseful;
    }

    public String getYelpingSince() {
        return yelpingSince;
    }

    public void setYelpingSince(String yelpingSince) {
        this.yelpingSince = yelpingSince == null ? null : yelpingSince.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "averageStars=" + averageStars +
                ", complimentsCool=" + complimentsCool +
                ", complimentsCute=" + complimentsCute +
                ", complimentsFunny=" + complimentsFunny +
                ", complimentsHot=" + complimentsHot +
                ", complimentsList=" + complimentsList +
                ", complimentsMore=" + complimentsMore +
                ", complimentsNote=" + complimentsNote +
                ", complimentsPhotos=" + complimentsPhotos +
                ", complimentsPlain=" + complimentsPlain +
                ", complimentsProfile=" + complimentsProfile +
                ", complimentsWriter=" + complimentsWriter +
                ", fans=" + fans +
                ", name='" + name + '\'' +
                ", reviewCount=" + reviewCount +
                ", type='" + type + '\'' +
                ", votesCool=" + votesCool +
                ", votesFunny=" + votesFunny +
                ", votesUseful=" + votesUseful +
                ", yelpingSince='" + yelpingSince + '\'' +
                '}';
    }
}