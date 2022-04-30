package com.aliaskar.bilingual.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Admin on 30.04.2022
 */
@Entity
@Builder
@Getter
@Setter
@Table(name = "question_results")
@AllArgsConstructor
public class QuestionResultEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Long count;
    private Long score;
    private boolean evaluated = false;
    private Type type;
    private String file;
    private String answer;

    @OneToMany(mappedBy = "questionResult")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<OptionResultEntity> optionResults;

    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({org.hibernate.annotations.CascadeType.MERGE, org.hibernate.annotations.CascadeType.PERSIST,
            org.hibernate.annotations.CascadeType.REFRESH})
    @JsonIgnore
    private TestResultEntity testResult;

    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({org.hibernate.annotations.CascadeType.MERGE, org.hibernate.annotations.CascadeType.PERSIST,
            org.hibernate.annotations.CascadeType.REFRESH})
    @JsonIgnore
    private QuestionEntity questionEntity;

    public QuestionResultEntity() {
    }

    @Override
    public String toString() {
        return "QuestionResultEntity{" +
                "id=" + id +
                ", evaluated=" + evaluated +
                ", type=" + type +
                ", file='" + file + '\'' +
                ", answer='" + answer + '\'' +
                ", optionResults=" + optionResults +
//                ", testResult=" + testResult +
//                ", questionEntity=" + questionEntity +
                '}';
    }
}

