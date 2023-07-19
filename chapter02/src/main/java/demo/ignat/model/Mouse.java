package demo.ignat.model;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Mouse {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init() {
        System.out.println("Mouse has been initialized");
    }

    @Override
    public String toString() {
        return "I`m Mouse, my name is " + name;
    }
}
