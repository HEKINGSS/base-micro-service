package com.example.demoservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoServiceApplicationTests {

    @Test
    void contextLoads() {
        int a = 0;
        Assertions.assertEquals(0, a);
    }

}
