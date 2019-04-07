package edu.njtu.model;

public class Music {
    private String businessId;

    private Boolean backgroundMusic;

    private Boolean dj;

    private Boolean jukebox;

    private Boolean karaoke;

    private Boolean live;

    private Boolean video;

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public Boolean getBackgroundMusic() {
        return backgroundMusic;
    }

    public void setBackgroundMusic(Boolean backgroundMusic) {
        this.backgroundMusic = backgroundMusic;
    }

    public Boolean getDj() {
        return dj;
    }

    public void setDj(Boolean dj) {
        this.dj = dj;
    }

    public Boolean getJukebox() {
        return jukebox;
    }

    public void setJukebox(Boolean jukebox) {
        this.jukebox = jukebox;
    }

    public Boolean getKaraoke() {
        return karaoke;
    }

    public void setKaraoke(Boolean karaoke) {
        this.karaoke = karaoke;
    }

    public Boolean getLive() {
        return live;
    }

    public void setLive(Boolean live) {
        this.live = live;
    }

    public Boolean getVideo() {
        return video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Music{" +
                "businessId='" + businessId + '\'' +
                ", backgroundMusic=" + backgroundMusic +
                ", dj=" + dj +
                ", jukebox=" + jukebox +
                ", karaoke=" + karaoke +
                ", live=" + live +
                ", video=" + video +
                '}';
    }
}