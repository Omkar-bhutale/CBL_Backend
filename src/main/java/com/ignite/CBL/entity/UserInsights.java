package com.ignite.CBL.entity;

import lombok.Data;

import java.util.List;


// data structure for the JSONB column.
@Data
public class UserInsights {

    private String bestLanguage;
    private List<String> weakAreas;
    private List<String> strongAreas;
    private String performance;
    private List<String> recommendations;

    // Getters and Setters

}