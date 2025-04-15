package com.example.jabl.orm.jpa;

import java.util.UUID;

public class InMemoryUniqueIdGenerator implements UniqueIdGenerator<UUID> {
    @Override
    public UUID getNextUniqueId() {
        return null;
    }
}
