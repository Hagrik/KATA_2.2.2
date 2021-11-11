package web.model;

import java.util.List;

public class Car {

    private String model;
    private String engineType;
    private int mileage;

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


    @Override
    public String toString() {
        return "\nCar{" +
                "model='" + model + '\'' +
                ", engineType='" + engineType + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
