package edu.njtu.model;

public class Neighborhood {
    private String id;

    private String businessId;

    private String neighborhoodId;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public String getNeighborhoodId() {
        return neighborhoodId;
    }

    public void setNeighborhoodId(String neighborhoodId) {
        this.neighborhoodId = neighborhoodId == null ? null : neighborhoodId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        return "Neighborhood{" +
                "id='" + id + '\'' +
                ", businessId='" + businessId + '\'' +
                ", neighborhoodId='" + neighborhoodId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}