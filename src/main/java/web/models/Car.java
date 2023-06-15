package web.models;

public class Car {
    private String model;
    private Integer year;
    private String country;

    public Car() {
    }

    public Car(String model, Integer year, String country) {
        this.model = model;
        this.year = year;
        this.country = country;
    }

    public String getModel() {
        return model;
    }


    public Integer getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

}
