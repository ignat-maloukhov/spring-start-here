package demo.ignat;

import demo.ignat.config.BeanConfig;
import demo.ignat.config.ComponentConfig;
import demo.ignat.model.Mouse;
import demo.ignat.model.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context1 = new AnnotationConfigApplicationContext(BeanConfig.class);

        Parrot p = context1.getBean("first", Parrot.class);
        System.out.println(p);

        String s = context1.getBean(String.class);
        System.out.println(s);

        Integer i = context1.getBean(Integer.class);
        System.out.println(i);

        var context2 = new AnnotationConfigApplicationContext(ComponentConfig.class);

        Mouse m = context2.getBean(Mouse.class);
        System.out.println(m);

    }
}
