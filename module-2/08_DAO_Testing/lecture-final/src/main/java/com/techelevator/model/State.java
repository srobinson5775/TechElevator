package com.techelevator.model;

import java.util.Objects;

public class State {

    private String stateAbbreviation;
    private String stateName;

    public State() {}

    public State(String stateAbbreviation, String stateName) {
        this.stateAbbreviation = stateAbbreviation;
        this.stateName = stateName;
    }

    public String getStateAbbreviation() {
        return stateAbbreviation;
    }

    public void setStateAbbreviation(String stateAbbreviation) {
        this.stateAbbreviation = stateAbbreviation;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return stateAbbreviation.equals(state.stateAbbreviation) && stateName.equals(state.stateName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stateAbbreviation, stateName);
    }
}
