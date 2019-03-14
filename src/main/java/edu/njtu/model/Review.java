package edu.njtu.model;


public class Review {

  private String id;
  private long stars;
  private java.sql.Timestamp date;
  private String text;
  private long useful;
  private long funny;
  private long cool;
  private String businessId;
  private String userId;


  public String getId() {
    return id;
  }

  public void setId(String id) {}
    this.id = id;
  }


  public long getStars() {
    return stars;
  }

  public void setStars(long stars) {}
    this.stars = stars;
  }


  public java.sql.Timestamp getDate() {
    return date;
  }

  public void setDate(java.sql.Timestamp date) {}
    this.date = date;
  }


  public String getText() {
    return text;
  }

  public void setText(String text) {}
    this.text = text;
  }


  public long getUseful() {
    return useful;
  }

  public void setUseful(long useful) {}
    this.useful = useful;
  }


  public long getFunny() {
    return funny;
  }

  public void setFunny(long funny) {}
    this.funny = funny;
  }


  public long getCool() {
    return cool;
  }

  public void setCool(long cool) {}
    this.cool = cool;
  }


  public String getBusinessId() {
    return businessId;
  }

  public void setBusinessId(String businessId) {}
    this.businessId = businessId;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {}
    this.userId = userId;
  }

}
