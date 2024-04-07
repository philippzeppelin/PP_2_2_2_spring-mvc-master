package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO {
    List<Car> listOfCars;

    {
        listOfCars = new ArrayList<>();

        listOfCars.add(new Car(1, "Nissan", 1000));
        listOfCars.add(new Car(2, "Lada", 1001));
        listOfCars.add(new Car(3, "Zaparozhets", 1002));
        listOfCars.add(new Car(4, "Subaru", 1003));
        listOfCars.add(new Car(5, "Mercedes", 1004));
    }

    @Override
    public List<Car> getListOfCars() {
        return listOfCars;
    }

    @Override
    public List<Car> getListOfCars(int numberOfCars) {
        if (numberOfCars >= listOfCars.size()) {
            return new ArrayList<>(listOfCars);
        }

        return new ArrayList<>(listOfCars.subList(0, numberOfCars));
    }
}