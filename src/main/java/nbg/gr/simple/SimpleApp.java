package nbg.gr.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(namedQueriesLocation = "classpath:jpa-named-queries.properties")
public class SimpleApp   {
    public static void main(String[] args) {
        SpringApplication.run(SimpleApp.class, args);
    }

}
