package com.example.Data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HealthRecord {

    private int id;
    private String name;
    private LocalDate bornDate;
    private Long phoneNumber;
    private int age;
}
