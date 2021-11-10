package web.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Car {

    private String model;
    private String engineType;
    private int mileage;
    private List<Car> carList = List.of(
            new Car("Mercedes GLA", "v4", 10000),
            new Car("Mercedes GLC", "v6", 20000),
            new Car("Audi a6", "v4", 100000),
            new Car("Jeep", "v8", 5000),
            new Car("Pontiac", "v8", 100));

    public Car() {
    }

    public Car(String model, String engineType, int mileage) {
        this.model = model;
        this.engineType = engineType;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "model='" + model + '\'' +
                ", engineType='" + engineType + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
