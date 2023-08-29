package com.sparta.memo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // Jpa 기능을 사용하겠다고 Spring한테 알려줘야 하기때문에 꼭 달아줘야한다.
@SpringBootApplication
public class MemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemoApplication.class, args);
    }

}
