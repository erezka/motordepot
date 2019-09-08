package epam.finalproject.motordepot.reporitory;

import epam.finalproject.motordepot.entities.Car;
import epam.finalproject.motordepot.entities.Driver;

import java.util.List;

public interface ICarRepository {
    Car getCarByID(int driverId);
    List<Car> getAllCars();
    void addCar(Car car);
    int deleteCarById(int carId);
    int updateCar(String columnName, String value, String carId);
}
