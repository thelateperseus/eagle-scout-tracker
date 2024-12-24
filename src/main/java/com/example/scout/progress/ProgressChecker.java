package com.example.scout.progress;

import com.example.scout.award.AwardService;
import java.time.LocalDate;
import java.util.Collection;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.modulith.moments.MonthHasPassed;
import org.springframework.stereotype.Component;

@Component
class ProgressChecker {

    private final ApplicationEventPublisher events;
    private final AwardService awardService;

    ProgressChecker(ApplicationEventPublisher events, AwardService awardService) {
        this.events = events;
        this.awardService = awardService;
    }

    @ApplicationModuleListener
    void onMonthHasPassed(MonthHasPassed event) {
        LocalDate checkDate = event.getMonth().atEndOfMonth();
        Collection<Long> scoutsBehindSchedule = awardService.scoutsBehindSchedule(checkDate);
        for (Long scoutId : scoutsBehindSchedule) {
            events.publishEvent(new ScoutBehindScheduleEvent(scoutId, checkDate));
        }
    }
}
