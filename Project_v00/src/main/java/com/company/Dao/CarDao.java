package com.company.Dao;

import com.company.Objects.Car;
import com.company.Objects.CarColor;
import com.company.Objects.CarMark;
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

    @Autowired
    CarColorRowMapper carColorRowMapper;

    @Autowired
    CarMarkRowMapper carMarkRowMapper;

    public List<CarColor> carColors(){
        String sqlQuery = "SELECT * FROM color";
        List<CarColor> colors = jdbcTemplate.query(sqlQuery, carColorRowMapper);
        return  colors;
    }


    public Car save(Car car){
        Object[] params = {car.getCarMark_id(), car.getCarModel_id(), car.getCarColor_id()};
        Integer id = jdbcTemplate.queryForObject("INSERT INTO \"car\" (mark_id, model_id, color_id) "+"VALUES (?,?,?) RETURNING id", params, Integer.class);
        car.setId(id);
        return car;
    }

    public CarMark MarkById(Integer id){
        String sqlQuery = "SELECT * FROM mark WHERE id = ?";
        Object[] params = {id};
        CarMark mark = jdbcTemplate.queryForObject(sqlQuery, params, carMarkRowMapper);
        return mark;
    }

    public CarModel ModelById(Integer id){
        String sqlQuery = "SELECT * FROM model WHERE id = ?";
        Object[] params = {id};
        CarModel model = jdbcTemplate.queryForObject(sqlQuery, params, carModelRowMapper);
        return model;
    }

    public CarColor ColorById(Integer id){
        String sqlQuery = "SELECT * FROM color WHERE id = ?";
        Object[] params = {id};
        CarColor color = jdbcTemplate.queryForObject(sqlQuery, params, carColorRowMapper);
        return color;
    }

    public Boolean exists(Integer id){
        String sqlQuery ="SELECT EXISTS (SELECT * FROM \"car\" WHERE id = ?)";
        Object[] params = {id};
        Boolean exists = jdbcTemplate.queryForObject(sqlQuery, params, Boolean.class);
        return exists;
    }
}
