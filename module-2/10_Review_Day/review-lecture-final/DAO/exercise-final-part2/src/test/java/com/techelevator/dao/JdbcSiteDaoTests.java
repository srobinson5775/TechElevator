package com.techelevator.dao;

import com.techelevator.model.Site;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class JdbcSiteDaoTests extends BaseDaoTests {

    private SiteDao dao;

    @Before
    public void setup() {
        dao = new JdbcSiteDao(dataSource);
    }

    @Test
    public void getSitesThatAllowRVs_Should_ReturnSites() {
        List<Site> sites = dao.getSitesThatAllowRVs(1);
        assertEquals("Incorrect count of sites allowing RVs", 2, sites.size());
    }

    @Test
    public void getAvailableSites_Should_ReturnSites() {
        List<Site> sites = dao.getAvailableSites(1);
        assertEquals("Incorrect count of currently available sites", 5, sites.size());
    }

    @Test
    public void getAvailableSitesDateRange_Should_ReturnSites() {

        List<Site> sites = dao.getAvailableSites(1, LocalDate.now(),LocalDate.now().plusDays(1));
        assertEquals("Incorrect count of sites for days +0 to +1", 4, sites.size());

        sites = dao.getAvailableSites(1, LocalDate.now().plusDays(3),LocalDate.now().plusDays(5));
        assertEquals("Incorrect count of sites for days +3 to +5", 8, sites.size());

        sites = dao.getAvailableSites(1, LocalDate.now().plusDays(1),LocalDate.now().plusDays(10));
        assertEquals("Incorrect count of sites for days +1 to +10", 5, sites.size());

        sites = dao.getAvailableSites(1, LocalDate.now().plusDays(3),LocalDate.now().plusDays(4));
        assertEquals("Incorrect count of sites for days +3 to +4", 9, sites.size());

        sites = dao.getAvailableSites(1, LocalDate.now().plusDays(10),LocalDate.now().plusDays(11));
        assertEquals("Incorrect count of sites for days +10 to +11", 8, sites.size());

        sites = dao.getAvailableSites(1, LocalDate.now().plusDays(11),LocalDate.now().plusDays(12));
        assertEquals("Incorrect count of sites for days +11 to +12", 11, sites.size());

    }
}
