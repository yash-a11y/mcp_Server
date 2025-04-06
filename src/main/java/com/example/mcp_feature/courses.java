package com.example.mcp_feature;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class courses {

    String name;
    float fees;
    int duration;

    public courses(String name, float fees, int duration
    ){

        this.name = name;
        this.duration = duration;
        this.fees = fees;

    }
}
