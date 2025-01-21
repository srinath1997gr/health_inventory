package com.example.DAO;

import com.example.Entity.HealthRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthRecordRepository  extends JpaRepository<HealthRecordEntity, Integer> {
}
