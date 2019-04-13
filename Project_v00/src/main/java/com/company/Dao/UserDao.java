package com.company.Dao;

import com.company.Objects.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

/**
 * Created by roi on 4/9/2019.
 */
@Component
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserRowMapper userRowMapper;

    public User find(Integer id){
        String sqlQuery = "SELECT * FROM \"user\" WHERE id = ?";
        Object[] params = {id};
        User u = jdbcTemplate.queryForObject(sqlQuery, params, userRowMapper);
        return u;
    }

    public User findByName(String username){
        String sqlQuery = "SELECT * FROM \"user\" WHERE username = ?";
        Object[] params = {username};
        User u = jdbcTemplate.queryForObject(sqlQuery, params, userRowMapper);
        return u;
    }

    public User save(User user){
        Object[] params = {user.getUsername(), user.getPassword()};
        Integer id = jdbcTemplate.queryForObject("INSERT INTO \"user\" (username, password) "+"VALUES (?,?) RETURNING id", params, Integer.class);
        user.setId(id);
        return user;
    }

    public Boolean exists(String username){
       String sqlQuery ="SELECT EXISTS (SELECT * FROM \"user\" WHERE username = ?)";
       Object[] params = {username};
       Boolean exists = jdbcTemplate.queryForObject(sqlQuery, params, Boolean.class);
       return exists;
    }
}
