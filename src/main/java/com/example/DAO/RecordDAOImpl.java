package com.example.DAO;

import com.example.Entity.HealthRecordEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Repository
public class RecordDAOImpl implements RecordDAO{

    @Autowired
    private HealthRecordRepository repository;

    @Override
    public HealthRecordEntity saveItem(HealthRecordEntity item) {
        return repository.save(item);
    }

    @Override
    public List<HealthRecordEntity> getAllItems() {
        return repository.findAll();
    }

    @Override
    public HealthRecordEntity getItemById(int id) {
        return repository.findById(id).orElse(null);
    }


    @Override
    public void deleteItem(int id) {
        repository.deleteById(id);
    }
}
