package web.service;

import web.model.Car;
import java.util.List;

public interface UserService {

    List<Car> getAllCars();
    List<Car> getCountCars(Integer count);

}
