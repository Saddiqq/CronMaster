package com.example.CronMaster;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class schedule {
    @Scheduled(cron = "0 3 * 11 0-4")
    public void schedule(){
        System.out.println("Cron Expression Executed");

    }
}

