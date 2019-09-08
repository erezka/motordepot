package epam.finalproject.motordepot.reporitory;

import epam.finalproject.motordepot.entities.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public class DriverRepository implements IDriverRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private RowMapper<Driver> DRIVER_ROW_MAPPER = ((resultSet, rowNumber) -> new Driver(
            resultSet.getInt("driver_id"),
            resultSet.getString("fullname"),
            resultSet.getInt("age"),
            resultSet.getInt("driving_experience"),
            resultSet.getLong("driving_licence_number")));

    @Override
    public Driver getDriverByID(int driverId) {
        String sql = "SELECT * FROM drivers WHERE driver_id = ?";
        return jdbcTemplate.queryForObject(sql,new Object[]{driverId},DRIVER_ROW_MAPPER);

    }

    @Override
    public List<Driver> getAllDrivers() {
        String sql = "SELECT * FROM drivers";
        return jdbcTemplate.query(sql,DRIVER_ROW_MAPPER);
    }

    @Override
    public void addDriver(Driver driver) {
        String sql = "INSERT INTO drivers(fullname,age,driving_experience,driving_licence_number)" +
                "VALUES(?,?,?,?)";
        jdbcTemplate.update(sql,driver.getFullname(),driver.getAge(),driver.getDrivingExpirience(), driver.getDrivingLicenceNumber());

    }

    @Override
    public int deleteDriverById(int driverId) {
        String sql = "DELETE FROM drivers WHERE driver_id = ?";
        return jdbcTemplate.update(sql,driverId);
    }

    @Override
    public int updateDriver(String columnName, String value, String driverId){
            String sql = "UPDATE drivers SET " + columnName + " = " + value +
                    " where driver_id = " + driverId;
            return jdbcTemplate.update(sql);
    }


}
