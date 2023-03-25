package itmo.java.basics.ex2;

public class RealEstate {
    private String place;
    private Boolean isApartment;
    private String category;
    private Integer numberOfFloors;
    private Double square;
    private Long price;

    public RealEstate() {

    }

    public RealEstate(String place, Boolean isApartment, String category, Integer numberOfFloors, Double square, Long price) {
        this.place = place;
        this.isApartment = isApartment;
        this.category = category;
        this.numberOfFloors = numberOfFloors;
        this.square = square;
        this.price = price;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Boolean getApartment() {
        return isApartment;
    }

    public void setApartment(Boolean apartment) {
        isApartment = apartment;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "place='" + place + '\'' +
                ", isApartment=" + isApartment +
                ", category='" + category + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                ", square=" + square +
                ", price=" + price +
                '}';
    }
}
