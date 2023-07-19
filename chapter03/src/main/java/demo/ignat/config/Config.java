package demo.ignat.config;

import demo.ignat.model.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "demo.ignat.model")
public class Config {

    @Bean
    public Parrot parrot1(){
        var parrot = new Parrot();
        parrot.setName("Parrot 1");
        return parrot;
    }

    @Bean
    public Parrot parrot2(){
        var parrot = new Parrot();
        parrot.setName("Parrot 2");
        return parrot;
    }

}
