package com.example.jabl.copsboot.user;

public record CreateUserParameters(AuthServerId authServerId, String email, String mobileToken) {
}
