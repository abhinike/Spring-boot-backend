package com.example.VeckorVorker.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Worker {
    private final UUID uid ;
    private final String name ;
    private final String category;

    public Worker( @JsonProperty("id") UUID uid,@JsonProperty("name") String name,@JsonProperty("category") String category){
        this.uid = uid;
        this.name = name;
        this.category = category;
    }

    public UUID getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}
