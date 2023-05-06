package com.example.testjenkins;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class TestJenkinsApplication {

    public static void main(String[] args) {
        log.info("test jenkins ");
        SpringApplication.run(TestJenkinsApplication.class, args);
    }

}
