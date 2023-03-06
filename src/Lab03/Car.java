package Lab03;

public class Car {
    private String color;
    private String name;
    private Double weight;
    public Car(){
    }
    public Car(String color){
        this.color = color;
    }
    public Car(String color, Double weight){
        this.color = color;
        this.weight = weight;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Double getWeight(){
        return weight;
    }
    public void setWeight(Double weight){
        this.weight = weight;
    }

    public void printCar(){
        System.out.println("\nДанные автомобиля:\n" +
                "Название - " + name + "\n" +
                "Цвет - " + color + "\n" +
                "Вес - " + weight);
    }
}
