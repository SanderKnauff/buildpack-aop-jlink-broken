package ooo.sansk.demo.buildpacks;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@SpringBootApplication
public class BuildpacksApplication {
    public static void main(String[] args) {
        SpringApplication.run(BuildpacksApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(BasicRepository repository) {
        return args -> {
            System.out.println(repository);
        };
    }

    @Bean
    DBConfig dbConfig() {
        return new DBConfig();
    }

    @Repository
    class BasicRepository {
        public BasicRepository(DBConfig dbConfig) {
        }
    }
}

record DBConfig() {}

