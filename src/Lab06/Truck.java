package Lab06;

public class Truck extends Car {
    private int maxWeight;
    private int numberOfWheels;

    public Truck(int w, String m, char c, float s, int maxWeight, int numberOfWheels){
        weight = w;
        model = m;
        color = c;
        speed = s;
        this.maxWeight = maxWeight;
        this.numberOfWheels = numberOfWheels;
    }

    public void newWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
        System.out.println("Новое количество колёс: " + numberOfWheels);
    }
}
