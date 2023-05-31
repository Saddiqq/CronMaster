package com.example.CronMaster;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class schedule {
    @Scheduled(cron = "15 0 14-20 *  0-4")
    public void schedule(){
        System.out.println("Cron Expression Executed");

    }
}

