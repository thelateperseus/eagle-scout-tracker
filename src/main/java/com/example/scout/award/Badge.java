package com.example.scout.award;

import org.springframework.data.annotation.Id;

record Badge(@Id Long id, String name, String description) {}
