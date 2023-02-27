package com.techelevator.dao;

import com.techelevator.model.Reservation;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.time.LocalDate;

public class JdbcReservationDao implements ReservationDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcReservationDao(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public int createReservation(int siteId, String name, LocalDate fromDate, LocalDate toDate) {
        int confirmationId = 0;
        return confirmationId;
    }
}
