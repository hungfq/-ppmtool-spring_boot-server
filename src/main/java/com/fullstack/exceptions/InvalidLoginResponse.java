package com.fullstack.exceptions;

public class InvalidLoginResponse {
    private String username;

    public InvalidLoginResponse() {
        this.username = "Invalid Username";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
