package com.company.Dao;

import com.company.Objects.Car;
import com.company.Objects.CarColor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by roi on 4/20/2019.
 */
@Component
public class CarColorRowMapper implements RowMapper<CarColor>{
    @Override
    public CarColor mapRow(ResultSet resultSet, int i) throws SQLException {
        CarColor c = new CarColor();
        c.setId(resultSet.getInt("id"));
        c.setColor(resultSet.getString("color"));
        return c;
    }
}
