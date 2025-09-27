package com.ignite.CBL.entity;

import lombok.Data;

import java.util.List;

@Data
public class McqOptions {
    private List<String> optionList;
    private Integer correctOption;
}
