package demonstration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
/**
 Cette classe doit etre dans un package parent de tous les autres composants
 pour qu'elle puisse les voir */