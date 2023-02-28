package com.techelevator.dao;

import com.techelevator.model.Site;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcSiteDao implements SiteDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcSiteDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Site> getSitesThatAllowRVs(int parkId){
        List<Site> siteList = new ArrayList<>();
        String sql = "SELECT site_id, s.campground_id, site_number, max_occupancy, accessible, max_rv_length, utilities " +
                "FROM site s " +
                "JOIN campground c ON s.campground_id = c.campground_id " +
                "JOIN park p ON c.park_id = p.park_id " +
                "WHERE s.max_rv_length > 0 AND park_id = ?; ";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, parkId);
        while(results.next()) {
            siteList.add(mapRowToSite(results));
        }
        return siteList;
    }

    private Site mapRowToSite(SqlRowSet rowSet) {
        Site site = new Site();
        site.setSiteId(rowSet.getInt("site_id"));
        site.setCampgroundId(rowSet.getInt("campground_id"));
        site.setSiteNumber(rowSet.getInt("site_number"));
        site.setMaxOccupancy(rowSet.getInt("max_occupancy"));
        site.setAccessible(rowSet.getBoolean("accessible"));
        site.setMaxRVLength(rowSet.getInt("max_rv_length"));
        site.setHasUtilities(rowSet.getBoolean("utilities"));

        return site;
    }

}
