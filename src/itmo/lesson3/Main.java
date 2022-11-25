package itmo.lesson3;

public class Main {
    public static void main(String[] args){
        //Task 1
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());
        System.out.println("");
        //Task 2
        Car car = new Car();
        car.setColor(Color.Blue);
        car.setName("Audi");
        car.setWeight(1000);
        Car.Print(car.getColor(), car.getName(), car.getWeight());
        System.out.println("");

        Car truck = new Car();
        truck.setColor(Color.Black);
        truck.setName("Man");
        truck.setWeight(2000);
        Car.Print(truck.getColor(), truck.getName(), truck.getWeight());
        System.out.println("");

        //Task3
        House house = new House();
        house.setName("Multi-storey apartment building");
        house.setFloors(12);
        house.setYear(2009);
        House.Print(house.getFloors(),house.getYear(), house.getName());
        System.out.println("Age "+House.age(house.getYear()));
        System.out.println("");

        House house2 = new House();
        house2.setName("Individual residential building");
        house2.setFloors(2);
        house2.setYear(1894);
        House.Print(house2.getFloors(),house2.getYear(), house2.getName());
        System.out.println("Age "+House.age(house2.getYear()));
        System.out.println("");

        //Task 4
        Tree tree = new Tree("Oak",118,true);
        System.out.println(tree);
        System.out.println("");

        Tree tree1 = new Tree("Spruce",82);
        System.out.println(tree1);
        System.out.println("");

        Tree tree2 = new Tree();
        System.out.println(tree2);
        System.out.println("");
    }
}
