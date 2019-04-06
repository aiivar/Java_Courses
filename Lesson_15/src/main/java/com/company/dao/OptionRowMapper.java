package com.company.dao;

import com.company.Option;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by roi on 4/6/2019.
 */
public class OptionRowMapper implements RowMapper<Option>{
    @Override
    public Option mapRow(ResultSet rs, int i) throws SQLException {
        Option o = new Option();
        o.setId(rs.getInt("id"));
        o.setText(rs.getString("text"));
        o.setVotes(rs.getInt("votes"));
        return o;
    }
}
