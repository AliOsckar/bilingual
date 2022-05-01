package com.aliaskar.bilingual.repo;

import com.aliaskar.bilingual.model.OptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Admin on 01.05.2022
 */
public interface OptionRepo extends JpaRepository<OptionEntity, Long> {
}
