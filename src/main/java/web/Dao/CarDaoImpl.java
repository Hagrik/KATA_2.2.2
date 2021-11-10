package web.Dao;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao{

    private Car car;

    @Override
    public List<Car> carCount(int number) {
        return car.getCarList().stream().limit(number).collect(Collectors.toList());
    }
}
