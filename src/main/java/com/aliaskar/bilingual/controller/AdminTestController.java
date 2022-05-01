package com.aliaskar.bilingual.controller;

import com.aliaskar.bilingual.dto.TestPostRequest;
import com.aliaskar.bilingual.model.TestEntity;
import com.aliaskar.bilingual.service.TestServiceForAdmin;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Admin on 30.04.2022
 */
@RestController
@RequestMapping("/api/admin/tests")
@Tag(name = "Admin Controller test", description = "Позволяет провести CRUD тестов")
@AllArgsConstructor
public class AdminTestController {
    private final TestServiceForAdmin testServiceForAdmin;

    @PostMapping("")
    public TestEntity saveTest(@RequestBody TestPostRequest request){
        return testServiceForAdmin.saveTest(request);

    }

}
