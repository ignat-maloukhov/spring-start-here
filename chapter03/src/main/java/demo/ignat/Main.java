package demo.ignat;

import demo.ignat.config.Config;
import demo.ignat.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(Config.class);
        var peron = context.getBean(Person.class);
        System.out.println(peron);


    }
}
