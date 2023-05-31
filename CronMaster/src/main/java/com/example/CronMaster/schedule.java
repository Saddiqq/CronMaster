package com.example.CronMaster;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class schedule {
    @Scheduled(cron = "0 * 2,4,6,8,10,12,14,16,18,20,22,24,26,28,30 * * ")
    public void schedule(){
        System.out.println("Cron Expression Executed");

    }
}

