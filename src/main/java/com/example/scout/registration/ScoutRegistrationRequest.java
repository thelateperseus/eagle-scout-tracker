package com.example.scout.registration;

import java.time.LocalDate;

record ScoutRegistrationRequest(String name, String email, LocalDate birthDate) {}
