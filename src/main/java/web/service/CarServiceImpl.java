package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.Dao.CarDao;
import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{

    private final CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCarList() {
        return carDao.getCarList();
    }

    @Override
    public List<Car> getCarByCount(Integer number) {
        return carDao.getCarList().stream().limit(number).collect(Collectors.toList());
    }
}