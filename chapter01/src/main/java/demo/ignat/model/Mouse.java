package demo.ignat.model;

import org.springframework.stereotype.Component;

@Component
public class Mouse {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "I`m model.Mouse, my name is " + name;
    }
}
