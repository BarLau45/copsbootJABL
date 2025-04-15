package com.example.jabl.orm.jpa;

public interface UniqueIdGenerator<T> {
    T getNextUniqueId();
}
