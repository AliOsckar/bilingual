package com.aliaskar.bilingual.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Admin on 30.04.2022
 */
@RestController
@RequestMapping("/api/admin/tests")
@Tag(name = "Admin Controller test", description = "Позволяет провести CRUD тестов")
@AllArgsConstructor
public class AdminController {

}
