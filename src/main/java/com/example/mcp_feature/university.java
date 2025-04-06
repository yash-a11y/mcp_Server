package com.example.mcp_feature;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class university {

    String name;
    String location;
    List<courses> courses;

    public university(String name, String location, List<courses> courses)
    {
        this.name = name;
        this.location = location;
        this.courses = courses;
    }
}
