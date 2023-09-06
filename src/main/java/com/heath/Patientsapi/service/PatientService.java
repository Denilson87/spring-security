package com.heath.Patientsapi.service;

import com.heath.Patientsapi.models.PatientModel;
import com.heath.Patientsapi.repositories.PatientRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class PatientService {

    final PatientRepository patientRepository;
    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
    @Transactional
    public PatientModel save(PatientModel patientModel) {
        return patientRepository.save(patientModel);
    }
    public Page<PatientModel> findAll(Pageable pageable) {
        return  patientRepository.findAll(pageable);
    }
    public Optional<PatientModel> findById(UUID id) {
        return patientRepository.findById(id);
    }
    @Transactional
    public void delete(PatientModel patientModel) {
        patientRepository.delete(patientModel);
    }
}
