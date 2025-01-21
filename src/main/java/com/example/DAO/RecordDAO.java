package com.example.DAO;


import com.example.Entity.HealthRecordEntity;

import java.util.List;

public interface RecordDAO {

    HealthRecordEntity saveItem(HealthRecordEntity item);

    List<HealthRecordEntity> getAllItems();

    HealthRecordEntity getItemById(int id);

    void deleteItem(int id);
}
