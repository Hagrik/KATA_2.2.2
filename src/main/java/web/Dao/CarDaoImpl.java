package web.Dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{

    @Override
    public List<Car> getCarList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mercedes GLA", "v4", 10000));
        cars.add(new Car("Mercedes GLC", "v6", 20000));
        cars.add(new Car("Audi a6", "v4", 100000));
        cars.add(new Car("Jeep", "v8", 5000));
        cars.add(new Car("Pontiac", "v8", 100));
        return cars;
    }
}
