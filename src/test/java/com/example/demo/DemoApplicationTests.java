package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    ContactsService service;

    @Test
    void contextLoads() throws Exception {

        Contact entity = new Contact();
        entity.setEmail("contact@email.com");
        entity.setFirstName("T1");
        entity.setLastName("C4");
        service.create(entity);

        service.getAll();
    }

}
