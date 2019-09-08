package epam.finalproject.motordepot.Service;


import epam.finalproject.motordepot.entities.Car;

import java.util.List;

public interface ICarService {
    Car getCarById(int carId);
    List<Car> getAllCars();
    void addCar(Car car);
    int deleteCarById(int carId);
    int updateCar(String columnName, String value, String carId);
}
