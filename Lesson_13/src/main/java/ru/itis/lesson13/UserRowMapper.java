package ru.itis.lesson13;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by roi on 3/30/2019.
 */
public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException{
        User u = new User();
        u.id = rs.getInt("id");
        u.username = rs.getString("username");
        u.password = rs.getString("password");
        return u;
    }
}
