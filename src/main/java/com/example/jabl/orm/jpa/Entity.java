package com.example.jabl.orm.jpa;

public interface Entity <T extends EntityId>{
    T getId();
}
