package com.techelevator.dao;

import com.techelevator.model.Campground;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcCampgroundDao implements CampgroundDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcCampgroundDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Campground> getCampgroundsByParkId(int parkId){

        return null;
    }

    private Campground mapRowToCampground(SqlRowSet rowSet) {
        Campground campground = new Campground();
        campground.setCampgroundId(rowSet.getInt("campground_id"));
        campground.setParkId(rowSet.getInt("parkId"));
        campground.setName(rowSet.getString("name"));

    }

}

