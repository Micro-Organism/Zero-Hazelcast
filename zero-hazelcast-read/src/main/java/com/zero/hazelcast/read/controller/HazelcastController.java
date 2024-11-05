package com.zero.hazelcast.read.controller;

import com.zero.hazelcast.read.domain.entity.SystemUserEntity;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HazelcastController {

    @Cacheable(value = "user")
    @GetMapping("user/{id}")
    public SystemUserEntity getSubscriber(@PathVariable("id") int id) throws InterruptedException {
        System.out.println("Finding user information with id " + id + " ...");
        return new SystemUserEntity(id, "John Smith", "CS");
    }
}