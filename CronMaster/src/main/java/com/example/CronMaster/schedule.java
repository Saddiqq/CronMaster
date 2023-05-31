package com.example.CronMaster;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class schedule {
    @Scheduled(cron = "30 4 1,15 * * ")
    public void schedule(){
        System.out.println("Cron Expression Executed");

    }
}

