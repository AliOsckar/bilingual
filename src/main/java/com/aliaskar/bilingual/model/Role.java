package com.aliaskar.bilingual.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

/**
 * Created by Admin on 30.04.2022
 */
@Entity
@Data
@Table(name = "roles")
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_role", nullable = false, unique = true)
    private String nameRole;

    @Override
    public String toString() {
        return nameRole;
    }

}
