package demo.ignat.config;

import demo.ignat.model.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfig {

    @Bean(name = "first")
    @Primary
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("John");
        return p;
    }

    @Bean(name = "second")
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("Mike");
        return p;
    }


    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
