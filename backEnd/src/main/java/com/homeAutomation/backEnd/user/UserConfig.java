package com.homeAutomation.backEnd.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UsersRepository repository){
        return args -> {
            Users xynee_naveen = new Users(
                    "Xynee Naveen",
                    "test@test.com",
                    123456789L,
                    LocalDate.now()
            );
            Users naveen = new Users(
                    "Naveen",
                    "test1@test.com",
                    987654321L,
                    LocalDate.now()
            );

            repository.saveAll(
                    List.of(xynee_naveen,naveen)
            );
        };
    }
}
