package itmo.lesson6.Transport;

public class Truck extends Car{
    protected int wheelNum;
    protected double maxWeight;
    public Truck() {
    }
    public void newWheel(int n){
        wheelNum = n;
        System.out.println(wheelNum);
    }

    public Truck(int w, String m, char c, float s) {
        super(w, m, c, s);
    }

    public Truck(int wheelNum, double maxWeight) {
        this.wheelNum = wheelNum;
        this.maxWeight = maxWeight;
    }

}
