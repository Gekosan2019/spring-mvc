package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<Car> getAllCars() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW", "BLUE", 17));
        carList.add(new Car("LAMBA", "YELLOW", 2020));
        carList.add(new Car("CAMRY", "BLACK", 35));
        carList.add(new Car("CADILLAC", "BLACK", 666));
        carList.add(new Car("PORSHE", "RED", 2005));
        return carList;
    }

    @Override
    public List<Car> getCountCars(Integer count) {
        return getAllCars().stream().limit(count).collect(Collectors.toList());
    }
}
