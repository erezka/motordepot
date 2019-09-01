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
    public Driver getDriverFromBDByID(int driverId){
        return driverRepository.getDriverFromBDByID(driverId);
    }

    @Override
    public List<Driver> getAllDrivers() {
        return driverRepository.getAllDrivers();
    }

    @Override
    public void addDriver(Driver driver){
        try{
            driverRepository.addDriver(driver);
            System.out.println("Операция выполнена успешно." + " " + "Водитель добавлен в базу.");
        }catch (NullPointerException e){
            System.out.println("Операция не выполнена:" + " " + e.getMessage());
        }
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
