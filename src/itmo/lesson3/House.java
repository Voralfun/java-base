package itmo.lesson3;

public class House {
    private Integer floors;
    private Integer year;
    private String name;

    public House(Integer floors, Integer year, String name) {
        this.floors = floors;
        this.year = year;
        this.name = name;
    }

    public House(){

    }

    public Integer getFloors() {
        return floors;
    }

    public Integer getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    static void Print(Integer floors, Integer year, String name){
        System.out.println(floors);
        System.out.println(year);
        System.out.println(name);

    }
    static Integer age(Integer year){
        return 2022-year;
    }
}
