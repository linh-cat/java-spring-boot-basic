package com.example.demo.students;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student john = new Student(2L,
                    "John", "John@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 29),
                    21);
            Student doe = new Student(3L,
                    "Doe", "Doe@gmail.com",
                    LocalDate.of(2001, Month.FEBRUARY, 23),
                    22);
            repository.saveAll(
                    List.of(john, doe)
            );
        };

    }
}
