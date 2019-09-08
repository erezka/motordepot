package epam.finalproject.motordepot.reporitory;

import epam.finalproject.motordepot.entities.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarRepository implements ICarRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private RowMapper<Car> CAR_ROW_MAPPER = ((resultSet, rowNumber) -> new Car(
            resultSet.getInt("car_id"),
            resultSet.getString("model"),
            resultSet.getString("number"),
            resultSet.getInt("mileage"),
            resultSet.getString("category"),
            resultSet.getInt("state"),
            resultSet.getDouble("max_cargo_weight")));

    @Override
    public Car getCarByID(int carId) {
        String sql = "SELECT * FROM cars WHERE car_id = ?";
        return jdbcTemplate.queryForObject(sql,new Object[]{carId},CAR_ROW_MAPPER);

    }

    @Override
    public List<Car> getAllCars() {
        String sql = "SELECT * FROM cars";
        return jdbcTemplate.query(sql,CAR_ROW_MAPPER);
    }

    @Override
    public void addCar(Car car) {
        String sql = "INSERT INTO cars(model,number,mileage,category,state,max_cargo_weight) " +
                "VALUES(?,?,?,?,?,?)";
        jdbcTemplate.update(sql,car.getModel(),car.getNumber(),car.getMileage(),car.getCategory(),car.getState(),car.getMaxCargoWeight());

    }

    @Override
    public int deleteCarById(int carId) {
        String sql = "DELETE FROM cars WHERE car_id = ?";
        return jdbcTemplate.update(sql,carId);
    }

    @Override
    public int updateCar(String columnName, String value, String driverId){
        String sql = "UPDATE cars SET " + columnName + " = " + value +
                " where car_id = " + driverId;
        return jdbcTemplate.update(sql);
    }

}
