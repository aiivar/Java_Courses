package com.company.dao;

import com.company.Poll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by roi on 4/6/2019.
 */
@Component
public class PollsDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    PollRowMapper pollRowMapper = new PollRowMapper();


    public List<Poll> findAll() {
        String sqlQuery = "SELECT * FROM poll " + "ORDER BY id";
        List<Poll> pollList = jdbcTemplate.query(sqlQuery, pollRowMapper);
        return pollList;
    }
}
