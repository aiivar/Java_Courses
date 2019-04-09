package com.company.Dao;

import com.company.Objects.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by roi on 4/9/2019.
 */
@Component
public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User u = new User();
        u.setId(resultSet.getInt("id"));
        u.setUsername(resultSet.getString("username"));
        u.setPassword(resultSet.getString("password"));
        return u;
    }
}
