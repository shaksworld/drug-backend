package com.shaks.drugproject.repository;

import com.shaks.drugproject.entity.Drug;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrugRepo extends JpaRepository<Drug, Long> {
}
