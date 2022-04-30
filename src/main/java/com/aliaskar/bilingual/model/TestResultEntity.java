package com.aliaskar.bilingual.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Admin on 30.04.2022
 */
@Entity
@Getter
@Setter
@Table(name = "test_results")
@AllArgsConstructor
public class TestResultEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Long score;
    private boolean evaluated = false;
    @CreatedDate
    private Date createdDate = new Date();

    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({org.hibernate.annotations.CascadeType.MERGE, org.hibernate.annotations.CascadeType.PERSIST,
            org.hibernate.annotations.CascadeType.REFRESH})
    @JsonIgnore
    private UserEntity user;

    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({org.hibernate.annotations.CascadeType.MERGE, org.hibernate.annotations.CascadeType.PERSIST,
            org.hibernate.annotations.CascadeType.REFRESH})
    @JsonIgnore
    private TestEntity test;

    @OneToMany(mappedBy = "testResult")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<QuestionResultEntity> questionResults;

    public void addQuestionResultForTestResult(QuestionResultEntity question) {
        if (questionResults == null) {
            questionResults = new ArrayList<>();
        }
        questionResults.add(question);
        question.setTestResult(this);

    }

    public TestResultEntity() {
    }

    @Override
    public String toString() {
        return "TestResultEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", score=" + score +
                ", evaluated=" + evaluated +
                ", createdDate=" + createdDate +
//                ", user=" + user +
//                ", test=" + test +
                ", questionResults=" + questionResults +
                '}';
    }
}
