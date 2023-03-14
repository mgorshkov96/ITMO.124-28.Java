package Lab06;
import java.util.Scanner;

public class Parent {
    private int age;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String enterInfo(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void setAndPrint(){
        System.out.print("Введите возраст: ");
        age = Integer.parseInt(enterInfo());
        System.out.println("Возраст: " + age);
    }

}
