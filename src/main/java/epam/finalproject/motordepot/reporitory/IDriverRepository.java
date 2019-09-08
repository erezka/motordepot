package epam.finalproject.motordepot.reporitory;

import epam.finalproject.motordepot.entities.Driver;

import java.util.List;

public interface IDriverRepository {
    Driver getDriverByID(int driverId);
    List<Driver> getAllDrivers();
    void addDriver(Driver driver);
    int deleteDriverById(int driverId);
    int updateDriver(String columnName, String value, String driverId);
}
