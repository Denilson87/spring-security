package com.heath.Patientsapi.controller;

import com.heath.Patientsapi.dtos.PatientDto;
import com.heath.Patientsapi.models.PatientModel;
import com.heath.Patientsapi.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/hostpital")

public class PatientController {

final  PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping("/patient")
    public ResponseEntity<PatientModel> savePatient(@RequestBody @Valid PatientDto patientDto) {
        var patientModel = new PatientModel();
        BeanUtils.copyProperties(patientDto, patientModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(patientService.save(patientModel));

        }
    @GetMapping("/patient")
    public ResponseEntity<Page<PatientModel>> getAllPatients(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK).body(patientService.findAll(pageable));
    }

    @GetMapping("/patient/{id}")
    public ResponseEntity<Object> getOnePatient(@PathVariable(value = "id") UUID id){
        Optional<PatientModel> patientModelOptional = patientService.findById(id);
        if (!patientModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Patient you're trying to get was not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(patientModelOptional.get());
    }

    @DeleteMapping("/patient/{id}")
    public ResponseEntity<Object> deleteOnePatient(@PathVariable( value = "id") UUID id){
        Optional<PatientModel> patientModelOptional = patientService.findById(id);
        if (!patientModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Patient you´re trying to delete does not exist!");
        }
        patientService.delete(patientModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Patient Deleted Succesfully!");
    }

    @PutMapping("patient/{id}")
    public ResponseEntity<Object> updatePatient(@PathVariable(value = "id") UUID id,
                                                 @RequestBody @Valid PatientDto patientDto){
        Optional<PatientModel> patientModelOptional = patientService.findById(id);
        if (!patientModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Patient not found.");
        }
        var patientModel = new PatientModel();
        BeanUtils.copyProperties(patientDto, patientModel);
        patientModel.setId(patientModelOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(patientService.save(patientModel));
    }



}
