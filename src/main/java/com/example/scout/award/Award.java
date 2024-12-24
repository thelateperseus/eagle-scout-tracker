package com.example.scout.award;

import java.time.Instant;
import org.springframework.data.annotation.Id;

record Award(@Id Long id, Long scoutId, Long badgeId, Instant dateAwarded) {}
