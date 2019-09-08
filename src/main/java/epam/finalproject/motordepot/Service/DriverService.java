package epam.finalproject.motordepot.Service;

import epam.finalproject.motordepot.entities.Driver;
import epam.finalproject.motordepot.reporitory.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DriverService implements IDriverService  {
    @Autowired
    private DriverRepository driverRepository;

    @Override
    public Driver getDriverByID(int driverId){
        return driverRepository.getDriverByID(driverId);
    }

    @Override
    public List<Driver> getAllDrivers() {
        return driverRepository.getAllDrivers();
    }

    @Override
    public void addDriver(Driver driver){
        driverRepository.addDriver(driver);
        System.out.println("Операция выполнена успешно." + " " + "Водитель добавлен в базу.");
    }

    @Override
    public int deleteDriverById(int driverId) {
        return driverRepository.deleteDriverById(driverId);
    }

    @Override
    public int updateDriver(String columnName, String value, String driverId){
        return driverRepository.updateDriver(columnName,value,driverId);
    }

}
