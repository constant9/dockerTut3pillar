package boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableWebMvc
@EnableMongoRepositories
//@PropertySource("classpath:application.properties")
public class EmployeeBoot {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeBoot.class);
    }

}