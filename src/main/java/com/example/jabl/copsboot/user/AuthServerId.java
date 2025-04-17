package com.example.jabl.copsboot.user;

import org.springframework.util.Assert;

import java.util.UUID;

public record AuthServerId(UUID value) {
    public AuthServerId {
        Assert.notNull(value, "The AuthServerId value must not be null");
    }

    public String asString() {
        return value.toString();
    }
}
