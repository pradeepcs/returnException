package com.lmg.returns.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
@Slf4j
public class Application {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
        log.info("Return Exception Service Started with arguments {} @ {} ", args, LocalDateTime.now());
    }

}
