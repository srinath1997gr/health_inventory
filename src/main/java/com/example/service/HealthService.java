package com.example.service;

import com.example.Data.HealthRecord;

import java.util.List;

public interface HealthService {

     HealthRecord addRecord(HealthRecord healthRecord);
     List<HealthRecord> getRecords();
     HealthRecord getRecordBYId(int id);
     void deleteRecord(int id);
}
