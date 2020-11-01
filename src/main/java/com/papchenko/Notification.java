package com.papchenko;

import java.time.LocalDateTime;

public class Notification {
    private final LocalDateTime time;
    private final String message;

    public Notification(LocalDateTime time, String message) {
        this.time = time;
        this.message = message;
    }

    public String text() {
        return time + ":" + time.getMinute() + ": " + message;
    }
}
