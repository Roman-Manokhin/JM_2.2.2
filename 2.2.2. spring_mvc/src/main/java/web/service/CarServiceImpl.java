package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{

    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Tesla", "Y", 3));
        cars.add(new Car("BMW", "X6", 6));
        cars.add(new Car("Lada", "Vesta", 13));
        cars.add(new Car("Ford", "Focus", 8));
        cars.add(new Car("Lamborghini", "Aventador", 7));

    }

    public List<Car> getCarsById(int countCars){
        if(countCars >= cars.size()){
            return cars;
        }
        return cars.subList(0, countCars);
    }
}
