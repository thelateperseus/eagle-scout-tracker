package com.example.scout.registration;

import org.springframework.data.annotation.Id;

record Leader(@Id Long id, String name, String email) {}
