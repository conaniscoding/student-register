package com.conan.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.conan")
public class Entry {
    public static void main(String[] args){
        SpringApplication.run(Entry.class, args);
    }
}
