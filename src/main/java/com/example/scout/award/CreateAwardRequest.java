package com.example.scout.award;

import java.time.Instant;

record CreateAwardRequest(Long scoutId, Long badgeId, Instant dateAwarded) {}
