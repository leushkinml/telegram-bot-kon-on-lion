package com.michael.telegrambotkononlion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TelegramBotKonOnLionApplication {
    public static void main(String[] args) {
        SpringApplication.run(TelegramBotKonOnLionApplication.class, args);
    }
}
