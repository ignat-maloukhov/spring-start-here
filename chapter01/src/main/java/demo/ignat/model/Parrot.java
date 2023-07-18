package demo.ignat.model;

public class Parrot {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "I`m model.Parrot, my name is " + name;
    }
}
