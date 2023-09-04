package com.heath.Patientsapi.controller;

import com.heath.Patientsapi.dtos.PatientDto;
import com.heath.Patientsapi.models.PatientModel;
import com.heath.Patientsapi.repositories.PatientRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @Autowired
    PatientRepository patientRepository;

    @PostMapping("/patient")

    public ResponseEntity<PatientModel> savePatient(@RequestBody @Valid PatientDto patientDto) {
        var patientModel = new PatientModel();
        BeanUtils.copyProperties(patientDto, patientModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(patientRepository.save(patientModel));

        }

}
