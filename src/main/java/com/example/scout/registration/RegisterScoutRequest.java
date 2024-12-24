package com.example.scout.registration;

import java.time.LocalDate;

record RegisterScoutRequest(String name, String email, LocalDate birthDate, Long leaderId) {}
