package com.example.jabl.copsboot.user;

import com.example.jabl.orm.jpa.UniqueIdGenerator;

import java.util.UUID;

public class UserRepositoryImpl implements UserRepositoryCustom {
    private final UniqueIdGenerator<UUID> generator;

    public UserRepositoryImpl(UniqueIdGenerator<UUID> generator) {
        this.generator = generator;
    }

    public UserId nextId() {
        return new UserId(generator.getNextUniqueId());
    }
}
