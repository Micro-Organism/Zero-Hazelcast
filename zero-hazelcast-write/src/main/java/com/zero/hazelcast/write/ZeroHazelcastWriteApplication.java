package com.zero.hazelcast.write;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class ZeroHazelcastWriteApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeroHazelcastWriteApplication.class, args);
    }

}
