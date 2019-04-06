package com.company.dao;

import com.company.Poll;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by roi on 4/6/2019.
 */
public class PollRowMapper implements RowMapper<Poll> {

    @Override
    public Poll mapRow(ResultSet rs, int i) throws SQLException {
        Poll p = new Poll();
        p.setId(rs.getInt("id"));
        p.setTitle(rs.getString("title"));
        return p;
    }
}
