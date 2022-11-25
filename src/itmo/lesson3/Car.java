package itmo.lesson3;

public class Car {
    private Color color;
    private String name;
    private Integer weight;
    public Car(Color color) {
        this.color = color;
    }

    public Car(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Car(){

    }
    static void Print(Color color, String name, Integer weight){
        System.out.println(name);
        System.out.println(color);
        System.out.println(weight);

    }
}

