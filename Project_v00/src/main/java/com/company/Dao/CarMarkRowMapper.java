package com.company.Dao;

import com.company.Objects.CarMark;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by roi on 4/20/2019.
 */
@Component
public class CarMarkRowMapper implements RowMapper<CarMark> {

    @Override
    public CarMark mapRow(ResultSet resultSet, int i) throws SQLException {
        CarMark c = new CarMark();
        c.setId(resultSet.getInt("id"));
        c.setName(resultSet.getString("name"));
        return c;
    }
}
