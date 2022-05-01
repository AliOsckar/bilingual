package com.aliaskar.bilingual.service;

import com.aliaskar.bilingual.dto.TestPostRequest;
import com.aliaskar.bilingual.model.TestEntity;
import com.aliaskar.bilingual.repo.AdminTestRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by Admin on 01.05.2022
 */
@Service
@AllArgsConstructor
public class TestServiceForAdmin {
    private final AdminTestRepo adminTestRepo;

    public TestEntity saveTest(TestPostRequest request) {
        TestEntity test = TestEntity.builder()
                .title(request.getTitle())
                .shortDescription(request.getShortDescription())
                .active(true)
                .build();
        return adminTestRepo.save(test);
    }
}
