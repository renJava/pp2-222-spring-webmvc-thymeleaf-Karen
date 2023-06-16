package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> car;
    String rus = "Россия";
    {
        car = new ArrayList<>();

        car.add(new Car("Нива", 2011, rus));
        car.add(new Car("Maybach", 2013, "Германия"));
        car.add(new Car("Aurus Senat", 2020, rus));
        car.add(new Car("УАЗ Patriot", 1993, rus));
        car.add(new Car("Mitsubishi Outlander", 2008, "Япония"));
    }

    @Override
    public List<Car> getCars() {
        return car;
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        if (count <= 0 || count > 5) return car;
        return car.stream().limit(count).toList();
    }

}
