package epam.finalproject.motordepot.Service;

import epam.finalproject.motordepot.entities.Driver;
import java.util.List;

public interface IDriverService  {
    Driver getDriverFromBDByID(int driverId);
    List<Driver> getAllDrivers();
    void addDriver(Driver driver);
    int deleteDriverById(int driverId);
    int updateDriver(String columnName, String value, String driverId);
}
