package com.example.jksj.study;

import com.video.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudyApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext context;


    @Test
    void contextLoadsA() {
        System.out.println(context.containsBean("helloService"));
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
