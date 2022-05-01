package com.aliaskar.bilingual.repo;

import com.aliaskar.bilingual.model.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Admin on 01.05.2022
 */

public interface AdminTestRepo extends JpaRepository<TestEntity, Long> {
    List<TestEntity>findAllByActiveTrue();

}
