package com.papchenko;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.*;

public class NotificationTest {

    @Test
    public void shouldReturnText() {
        LocalDateTime time = LocalDateTime.of(2020, Month.NOVEMBER, 1, 13, 56);
        Notification notification = new Notification(time, "hello");

        String result = notification.text();

        assertEquals("13:56: hello", result);
    }
}