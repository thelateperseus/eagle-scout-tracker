package com.example.scout.award;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class AwardService {
    public Collection<Long> scoutsBehindSchedule(LocalDate date) {
      // TODO figure out how to implement this without blending bounded contexts
        return Set.of();
    }
}
