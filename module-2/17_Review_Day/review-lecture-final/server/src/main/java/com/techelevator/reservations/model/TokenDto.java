package com.techelevator.reservations.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/*
    The acronym DTO is being used for "data transfer object". It means that this type of class is specifically
    created to transfer data between the client and the server. For example, LoginDto represents the data a client must
    pass to the server for a login endpoint, and TokenDto represents the object that's returned from the server
    to the client from a login endpoint.
 */
public class TokenDto {

    private String token;

    public TokenDto(String token) {
        this.token = token;
    }

    @JsonProperty("token")
    String getToken() {
        return token;
    }

    void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TokenDto tokenDto = (TokenDto) o;
        return token.equals(tokenDto.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token);
    }
}
