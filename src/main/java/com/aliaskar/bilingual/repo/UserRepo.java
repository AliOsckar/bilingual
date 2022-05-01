package com.aliaskar.bilingual.repo;

import com.aliaskar.bilingual.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by Admin on 01.05.2022
 */
public interface UserRepo extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByGmail(String email);

    Boolean existsByGmail(String email);
}
