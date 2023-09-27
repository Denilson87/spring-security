package com.heath.Patientsapi.repositories;

import com.heath.Patientsapi.models.UserModel;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, UUID> {
}
