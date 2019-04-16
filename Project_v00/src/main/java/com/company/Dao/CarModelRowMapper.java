package com.company.Dao;

import com.company.Objects.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by roi on 4/16/2019.
 */
@Component
public class CarModelRowMapper implements RowMapper<CarModel>{

    @Override
    public CarModel mapRow(ResultSet resultSet, int i) throws SQLException {
        CarModel cm = new CarModel();
        cm.setId(resultSet.getInt("id"));
        cm.setName(resultSet.getString("name"));
        cm.setMark_id(resultSet.getInt("mark_id"));
        return cm;
    }
}
