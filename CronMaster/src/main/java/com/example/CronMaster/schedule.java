package com.example.CronMaster;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class schedule {
    @Scheduled(cron = "* * * * * *")
    public void schedule(){
        System.out.println("Test1");
    }
}

