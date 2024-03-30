package web.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.List;

@Component
public class CarDAOImpl implements CarDAO {
    private final JdbcTemplate jdbcTemplate;

    public CarDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Car> listCars() {
        return jdbcTemplate.query("SELECT * FROM Car;",
                new BeanPropertyRowMapper<>(Car.class));
    }

    @Override
    public List<Car> listCars(int numberOfCars) {
        return jdbcTemplate.query("SELECT * FROM Car LIMIT ?",
                new Object[]{numberOfCars},
                new BeanPropertyRowMapper<>(Car.class));
    }
}
