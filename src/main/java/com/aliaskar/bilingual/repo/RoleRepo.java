package com.aliaskar.bilingual.repo;

import com.aliaskar.bilingual.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Admin on 01.05.2022
 */
@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByNameRole(String role);
}
