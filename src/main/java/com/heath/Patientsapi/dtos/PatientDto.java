package com.heath.Patientsapi.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PatientDto(@NotBlank String name, @NotNull Integer age,
                         @NotBlank String Disease, @NotBlank String addres) {
}
