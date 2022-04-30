package com.aliaskar.bilingual.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

/**
 * Created by Admin on 30.04.2022
 */

@Entity
@Getter
@Setter
@Table(name = "option_results")
@AllArgsConstructor
public class OptionResultEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean answer;
    private String word = "";

    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({org.hibernate.annotations.CascadeType.MERGE, org.hibernate.annotations.CascadeType.PERSIST,
            org.hibernate.annotations.CascadeType.REFRESH})
    @JsonIgnore
    private OptionEntity option;

    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({org.hibernate.annotations.CascadeType.MERGE, org.hibernate.annotations.CascadeType.PERSIST,
            org.hibernate.annotations.CascadeType.REFRESH})
    @JsonIgnore
    private QuestionResultEntity questionResult;

    public OptionResultEntity() {
    }

    @Override
    public String toString() {
        return "OptionResultEntity{" +
                "id=" + id +
                ", answer=" + answer +
                ", word='" + word + '\'' +
                ", option=" + option +
//                ", questionResult=" + questionResult +
                '}';
    }
}
