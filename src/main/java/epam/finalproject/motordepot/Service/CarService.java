package epam.finalproject.motordepot.Service;

import epam.finalproject.motordepot.entities.Car;
import epam.finalproject.motordepot.reporitory.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService implements ICarService {
    @Autowired
    private CarRepository carRepository;

    public Car getCarById(int carId){
        return carRepository.getCarByID(carId);
    }

    public List <Car> getAllCars(){
        return carRepository.getAllCars();
    }

    public void addCar(Car car){
        carRepository.addCar(car);
    }

    public int deleteCarById(int carId){
        return  carRepository.deleteCarById(carId);
    }

    public int updateCar(String columnName, String value, String carId){
        return  carRepository.updateCar(columnName,value,carId);
    }
}
