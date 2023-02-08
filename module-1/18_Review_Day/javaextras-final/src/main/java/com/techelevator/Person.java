package com.techelevator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Person {

    public static final String BIRTHDATE_FORMAT = "MM/dd/yyyy";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(BIRTHDATE_FORMAT);

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String ssn;

    public Person(String firstName, String lastName, LocalDate birthDate, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return firstName.equals(person.firstName) && lastName.equals(person.lastName) && birthDate.equals(person.birthDate) && ssn.equals(person.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthDate, ssn);
    }

    //nice to have if directly displaying your object  e.g. person.toString()
    @Override
    public String toString() {
        return  "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", ssn='" + ssn + '\'' +
                '}';

    }
}
