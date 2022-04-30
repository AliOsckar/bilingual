package com.aliaskar.bilingual.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Admin on 30.04.2022
 */
@Entity
@Builder
@Getter
@Setter
@Table(name = "tests")
@AllArgsConstructor
public class QuestionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String duration;
    private boolean active = true;

    private int count;
    private String correctAnswer;
    private String file;
    private String statement;
    private String passage;

    @Enumerated(EnumType.STRING)
    private Type type;

    @ManyToOne
    @JsonIgnore
    private TestEntity test;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<OptionEntity> options;

    public QuestionEntity() {
    }

    @Override
    public String toString() {
        return "QuestionEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", duration='" + duration + '\'' +
                ", active=" + active +
                ", count=" + count +
                ", correctAnswer='" + correctAnswer + '\'' +
                ", file='" + file + '\'' +
                ", statement='" + statement + '\'' +
                ", passage='" + passage + '\'' +
                ", type=" + type +
                ", test=" + test +
                ", options=" + options +
                '}';
    }
}
