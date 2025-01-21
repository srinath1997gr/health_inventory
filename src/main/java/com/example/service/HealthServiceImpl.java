package com.example.service;

import com.example.Data.HealthRecord;
import com.example.Entity.HealthRecordEntity;
import com.example.Mapper.RecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.DAO.RecordDAO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HealthServiceImpl implements HealthService {

    @Autowired
    private RecordDAO recordDAO;

    @Override
    public HealthRecord addRecord(HealthRecord healthRecord) {
        HealthRecordEntity entity = RecordMapper.toEntity(healthRecord);
        return RecordMapper.toDto(recordDAO.saveItem(entity));    }

    @Override
    public List<HealthRecord> getRecords() {
        List<HealthRecordEntity> entities = recordDAO.getAllItems();

        List<HealthRecord> healthRecords = new ArrayList<>();
        for(HealthRecordEntity entity : entities){
            healthRecords.add(RecordMapper.toDto(entity));
        }
        return healthRecords;
    }

    @Override
    public HealthRecord getRecordBYId(int id) {

        HealthRecordEntity entity = recordDAO.getItemById(id);
        return entity != null ? RecordMapper.toDto(entity) : null;
    }

    @Override
    public void deleteRecord(int id) {
        recordDAO.deleteItem(id);
    }
}
