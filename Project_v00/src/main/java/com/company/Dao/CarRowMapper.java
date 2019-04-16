package com.company.Dao;

import com.company.Objects.Car;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by roi on 4/16/2019.
 */
@Component
public class CarRowMapper implements RowMapper<Car> {

    @Override
    public Car mapRow(ResultSet resultSet, int i) throws SQLException {
        Car c = new Car();
        c.setId(resultSet.getInt("id"));
        c.setCarMark_id(resultSet.getInt("mark_id"));
        c.setCarModel_id(resultSet.getInt("model_id"));
        c.setCarColor_id(resultSet.getInt("color_id"));
        return c;
    }
}