package com.techelevator.model;

import java.util.Objects;

public class Site {
    private int siteId;
    private int campgroundId;
    private int siteNumber;
    private int maxOccupancy;
    private boolean isAccessible;
    private int maxRVLength;
    private boolean hasUtilities;

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    public int getCampgroundId() {
        return campgroundId;
    }

    public void setCampgroundId(int campgroundId) {
        this.campgroundId = campgroundId;
    }

    public int getSiteNumber() {
        return siteNumber;
    }

    public void setSiteNumber(int siteNumber) {
        this.siteNumber = siteNumber;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public boolean isAccessible() {
        return isAccessible;
    }

    public void setAccessible(boolean accessible) {
        isAccessible = accessible;
    }

    public int getMaxRVLength() {
        return maxRVLength;
    }

    public void setMaxRVLength(int maxRVLength) {
        this.maxRVLength = maxRVLength;
    }

    public boolean isHasUtilities() {
        return hasUtilities;
    }

    public void setHasUtilities(boolean hasUtilities) {
        this.hasUtilities = hasUtilities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Site site = (Site) o;
        return siteId == site.siteId && campgroundId == site.campgroundId && siteNumber == site.siteNumber && maxOccupancy == site.maxOccupancy && isAccessible == site.isAccessible && maxRVLength == site.maxRVLength && hasUtilities == site.hasUtilities;
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteId, campgroundId, siteNumber, maxOccupancy, isAccessible, maxRVLength, hasUtilities);
    }

    @Override
    public String toString() {
        return "Site{" +
                "siteId=" + siteId +
                ", campgroundId=" + campgroundId +
                ", siteNumber=" + siteNumber +
                ", maxOccupancy=" + maxOccupancy +
                ", isAccessible=" + isAccessible +
                ", maxRVLength=" + maxRVLength +
                ", hasUtilities=" + hasUtilities +
                '}';
    }

    //Override toString(), equals() and hashcode()
}

