package com.pc1.pc1;

import org.springframework.boot.SpringApplication;

public class TestPc1Application {

    public static void main(String[] args) {
        SpringApplication.from(Pc1Application::main).with(TestcontainersConfiguration.class).run(args);
    }

}
