package com.example.CronMaster;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class schedule {
    @Scheduled(cron = "5 9-18 * * 5-6")
    public void schedule(){
        System.out.println("Cron Expression Executed");

    }
}

