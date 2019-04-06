package com.company.dao;

import com.company.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by roi on 4/6/2019.
 */
@Component
public class OptionDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    OptionRowMapper optionRowMapper = new OptionRowMapper();

    public List<Option> findOptionsByPollId(Integer pollId){
        String sqlQuery = "SELECT * FROM option "+"WHERE poll_id = ?";
        Object[] params = {pollId};
        List<Option> options = jdbcTemplate.query(sqlQuery, params, optionRowMapper);
        return  options;
    }

    public void addVote(Integer optionId){
        String sqQuery = "UPDATE option SET votes = votes + 1 "+"WHERE id = ?";
        Object[] params = {optionId};
        jdbcTemplate.update(sqQuery, params);
    }
}
