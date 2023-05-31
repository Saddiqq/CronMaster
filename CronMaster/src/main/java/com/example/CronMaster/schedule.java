package com.example.CronMaster;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class schedule {
    @Scheduled(cron = "15 8-22 * * *")
    public void schedule(){
        System.out.println("Cron Expression Executed");


    }
}

