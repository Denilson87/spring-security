package com.heath.Patientsapi.service;

import com.heath.Patientsapi.models.PatientModel;
import com.heath.Patientsapi.models.UserModel;
import com.heath.Patientsapi.repositories.PatientRepository;
import com.heath.Patientsapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository patientRepository) {
        this.userRepository = patientRepository;
    }

    public Page<UserModel> findAll(Pageable pageable) {
        return  userRepository.findAll(pageable);
    }
}
