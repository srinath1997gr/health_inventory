package com.example.Mapper;

import com.example.Data.HealthRecord;
import com.example.Entity.HealthRecordEntity;

public interface RecordMapper {

    static HealthRecord toDto(HealthRecordEntity entity) {
        HealthRecord healthRecord = new HealthRecord();
        healthRecord.setId(entity.getId());
        healthRecord.setName(entity.getName());
        healthRecord.setBornDate(entity.getBornDate());
        healthRecord.setPhoneNumber(entity.getPhoneNumber());
        healthRecord.setAge(entity.getAge());
        return healthRecord;
    }

    static HealthRecordEntity toEntity(HealthRecord dto) {
        HealthRecordEntity entity = new HealthRecordEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setBornDate(dto.getBornDate());
        entity.setPhoneNumber(dto.getPhoneNumber());
        entity.setAge(dto.getAge());
        return entity;
    }
}