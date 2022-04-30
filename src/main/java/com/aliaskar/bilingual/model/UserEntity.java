package com.aliaskar.bilingual.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by Admin on 30.04.2022
 */
@Entity
@Setter
@Getter
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_Name")
    private String fullName;

    @Column(name = "gmail")
    private String gmail;

    @Column(name = "active")
    private boolean active = true;

    @Column(name = "password", length = 1000)
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "roles_id"))
    @JsonIgnore
    private Set<Role> roles;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<TestResultEntity> userResults;

    public UserEntity(String fullName, String gmail, String password) {
        this.fullName = fullName;
        this.gmail = gmail;
        this.password = password;
    }

    public UserEntity() {
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", gmail='" + gmail + '\'' +
                ", active=" + active +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                ", userResults=" + userResults +
                '}';
    }
}
