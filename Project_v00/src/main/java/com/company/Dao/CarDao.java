package com.company.Dao;

import com.company.Objects.Car;
import com.company.Objects.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by roi on 4/16/2019.
 */
@Component
public class CarDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    CarRowMapper carRowMapper;
    @Autowired
    CarModelRowMapper carModelRowMapper;

    public Car find(Integer id){
        String sqlQuery = "SELECT * FROM \"car\" WHERE id = ?";
        Object[] params = {id};
        Car c = jdbcTemplate.queryForObject(sqlQuery, params, carRowMapper);
        return c;
    }

    public Car findByName(String username){
        String sqlQuery = "SELECT * FROM \"user\" WHERE username = ?";
        Object[] params = {username};
        Car c = jdbcTemplate.queryForObject(sqlQuery, params, carRowMapper);
        return c;
    }

    public List<CarModel> carsByMark(Integer mark_id){
        String sqlQuery = "SELECT * FROM model WHERE mark_id = ?"+" ORDER BY name";
        Object[] params = {mark_id};
        List<CarModel> models = jdbcTemplate.query(sqlQuery, params, carModelRowMapper);
        return  models;
    }





    public Car save(Car car){
        Object[] params = {car.getCarMark_id(), car.getCarModel_id(), car.getCarColor_id()};
        Integer id = jdbcTemplate.queryForObject("INSERT INTO \"car\" (mark_id, model_id, color_id) "+"VALUES (?,?,?) RETURNING id", params, Integer.class);
        car.setId(id);
        return car;
    }

    public Boolean exists(Integer id){
        String sqlQuery ="SELECT EXISTS (SELECT * FROM \"car\" WHERE id = ?)";
        Object[] params = {id};
        Boolean exists = jdbcTemplate.queryForObject(sqlQuery, params, Boolean.class);
        return exists;
    }
}
