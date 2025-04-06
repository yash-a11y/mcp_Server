package com.example.mcp_feature;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class courseService {

    private List<university> universities = new ArrayList<>();

    @Tool(name = "get_university_list", description = "Get universities details with it's courses")
    public List<university> getUniversities()
    {
        return  universities;
    }

    @Tool(name = "get_university", description = "Get particular university details with it's courses")
    public university getuniversity(String university)
    {

        return universities.stream().filter(uni -> uni.getName().equals(university)).findFirst().orElse(null);
    }

    @PostConstruct
    public void init(){
        List<courses> uc1 = new ArrayList<>();
        List<courses> uc2 = new ArrayList<>();

        courses c1 = new courses(
                "MAC",
                42000.0F,
                16

        );

        courses c2 = new courses(
                "Electrical engineering",
                46000.0F,
                16
        );

        uc1.add(c1);
        uc1.add(c2);

         courses c3 = new courses(
                "MAC",
                45000.0F,
                16

        );

        courses c4 = new courses(
                "Electrical engineering",
                42000.0F,
                16
        );

        uc2.add(c3); uc2.add(c4);
        universities.add(
                new university(
                        "university of windsor",
                        "windsor, ontario",
                        uc1
                )
        );

        universities.add(
                new university(
                        "Concordia university",
                        "Montreal",
                        uc2
                )
        );


    }
}
