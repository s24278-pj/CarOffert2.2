import java.util.Comparator;

public class Car {
    private String carBrand;
    private Integer carProductionYear;
    private int carMileage;
    private Double carPrice;

    public Car(String carBrand, int carProductionYear, int carMileage, Double carPrice) {
        this.carBrand = carBrand;
        this.carProductionYear = carProductionYear;
        this.carMileage = carMileage;
        this.carPrice = carPrice;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Integer getCarProductionYear() {
        return carProductionYear;
    }

    public void setCarProductionYear(int carProductionYear) {
        this.carProductionYear = carProductionYear;
    }

    public int getCarMileage() {
        return carMileage;
    }

    public void setCarMileage(int carMileage) {
        this.carMileage = carMileage;
    }

    public Double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Double carPrice) {
        this.carPrice = carPrice;
    }

    public static class Comparators {
    }
}
