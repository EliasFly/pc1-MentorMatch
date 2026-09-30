package com.pc1.pc1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class Pc1ApplicationTests {

    @Test
    void contextLoads() {
    }

}
