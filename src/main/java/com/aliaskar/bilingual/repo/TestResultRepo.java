package com.aliaskar.bilingual.repo;

import com.aliaskar.bilingual.model.TestResultEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Admin on 01.05.2022
 */
public interface TestResultRepo extends JpaRepository<TestResultEntity, Long> {
}
