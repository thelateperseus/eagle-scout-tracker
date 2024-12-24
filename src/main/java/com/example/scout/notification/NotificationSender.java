package com.example.scout.notification;

import com.example.scout.progress.ScoutBehindScheduleEvent;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Component;

@Component
class NotificationSender {

    @ApplicationModuleListener
    void onScoutBehindSchedule(ScoutBehindScheduleEvent event) {
        // TODO send notification
        System.out.printf("Scount %d behind schedule as of %s%n", event.scoutId(), event.checkDate());
    }
}
