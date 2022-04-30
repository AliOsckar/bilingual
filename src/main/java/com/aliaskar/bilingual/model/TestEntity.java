package com.aliaskar.bilingual.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    private Long id;
    private boolean active =true;
    private String title;
    private String duration;
    private String shortDescription;

    @OneToMany(mappedBy = "test")
    @JsonIgnore
    private List<QuestionEntity> questions;

    @OneToMany(mappedBy = "test")
    @JsonIgnore
    private List<TestResultEntity> userResults;

    public void addQuestionForTest(QuestionEntity question) {
        if (questions == null){
            questions = new ArrayList<>();
        }
        questions.add(question);
        question.setTest(this);
    }

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
