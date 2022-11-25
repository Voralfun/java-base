package itmo.lesson3;

public class Tree {
    private String name;
    private Integer age;
    private Boolean alive;

    public Tree(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Tree(String name, Integer age, Boolean alive) {
        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    public Tree() {
        System.err.println("Empty constructor without parameters worked");
    }
}
