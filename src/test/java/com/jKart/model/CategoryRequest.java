package com.jKart.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CategoryRequest {

    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CategoryRequest{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
