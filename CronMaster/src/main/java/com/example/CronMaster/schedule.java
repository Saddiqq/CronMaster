package com.example.CronMaster;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class schedule {
    @Scheduled(cron = "5 0 1-10 1 * ")
    public void schedule(){
        System.out.println("Cron Expression Executed");

    }
}

