package edu.njtu.model;


public class Business {

  private String id;
  private String name;
  private String neighborhood;
  private String address;
  private String city;
  private String state;
  private String postalCode;
  private double latitude;
  private double longitude;
  private double stars;
  private long reviewCount;
  private long isOpen;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getNeighborhood() {
    return neighborhood;
  }

  public void setNeighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public double getLatitude() {
    return latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }


  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }


  public double getStars() {
    return stars;
  }

  public void setStars(double stars) {
    this.stars = stars;
  }


  public long getReviewCount() {
    return reviewCount;
  }

  public void setReviewCount(long reviewCount) {
    this.reviewCount = reviewCount;
  }


  public long getIsOpen() {
    return isOpen;
  }

  public void setIsOpen(long isOpen) {
    this.isOpen = isOpen;
  }

}
