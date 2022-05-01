package com.aliaskar.bilingual.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Admin on 01.05.2022
 */
@Getter@Setter
public class TestPostRequest {
    private String title;
    private String shortDescription;
    private boolean active;
}
