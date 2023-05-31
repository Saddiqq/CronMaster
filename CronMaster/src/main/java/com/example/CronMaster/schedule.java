package com.example.CronMaster;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class schedule {
    @Scheduled(cron = "30,30 19,22  *,*  *,*  0,0")
    public void schedule(){
        System.out.println("Cron Expression Executed");


    }
}

