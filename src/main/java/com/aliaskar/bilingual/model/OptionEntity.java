package com.aliaskar.bilingual.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Getter
@Setter
@Table(name = "options")
@AllArgsConstructor
public class OptionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String word;
    private boolean correct;
    private String file;

    @ManyToOne
    @JsonIgnore
    private QuestionEntity question;

    public OptionEntity() {
    }

    @Override
    public String toString() {
        return "OptionEntity{" +
                "id=" + id +
                ", word='" + word + '\'' +
                ", correct=" + correct +
                ", file='" + file + '\'' +
                ", question=" + question +
                '}';
    }
}
