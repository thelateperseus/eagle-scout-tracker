package com.example.scout.registration;

import java.time.LocalDate;
import org.springframework.data.annotation.Id;

record Scout(@Id Long id, String name, String email, LocalDate birthDate) {}
