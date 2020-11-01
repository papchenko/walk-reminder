package com.papchenko;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Runnable helloRunnable = () -> {
            Notification notification = new Notification(LocalDateTime.now(), "it is time to walk");
            System.out.println(notification.text());
        };


        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(helloRunnable, 0, 3, TimeUnit.SECONDS);
    }
}
