package com.aliaskar.bilingual.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Admin on 30.04.2022
 */
@Entity
@Builder
@Getter@Setter
@Table(name = "tests")
@AllArgsConstructor
public class TestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private boolean active =true;
    private String title;
    private String duration;
    private String shortDescription;

    public TestEntity() {
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "id=" + id +
                ", active=" + active +
                ", title='" + title + '\'' +
                ", duration='" + duration + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                '}';
    }
}
