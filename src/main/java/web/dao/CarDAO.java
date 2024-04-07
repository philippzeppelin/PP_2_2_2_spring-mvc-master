package web.dao;

import web.models.Car;

import java.util.List;

public interface CarDAO {
    List<Car> getListOfCars();

    List<Car> getListOfCars(int numberOfCars);
}