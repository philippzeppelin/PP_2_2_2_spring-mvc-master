package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> showCars() {
        return carDAO.listCars();
    }

    @Override
    public List<Car> showCars(int numberOfCars) {
        return carDAO.listCars(numberOfCars);
    }
}
