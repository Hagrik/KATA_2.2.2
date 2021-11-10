package web.service;

import web.Dao.CarDao;
import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private CarDao carDao;

    @Override
    public List<Car> carCount(int number) {
        return this.carDao.carCount(number);
    }
}