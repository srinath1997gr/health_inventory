package com.example.controller;

import com.example.Data.HealthRecord;
import com.example.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InventoryController {

    @Autowired
    private HealthService healthService;
    

    @PostMapping
    public String addRecord(@RequestBody HealthRecord healthRecord) {
        healthService.addRecord(healthRecord);
        return "Record added successfully.";
    }

    @GetMapping
    public List<HealthRecord> getAllRecords(){
        List<HealthRecord> healthRecords = healthService.getRecords();
        return healthRecords;
    }

    @GetMapping("/{id}")
    public HealthRecord getRecordByID(@PathVariable int id){
        HealthRecord healthRecord = healthService.getRecordBYId(id);
        return healthRecord;
    }

    @DeleteMapping("/{id}")
    public String deleteRecord(@PathVariable int id){
        healthService.deleteRecord(id);
        return "Record is deleted for id = " + id;
    }


}
