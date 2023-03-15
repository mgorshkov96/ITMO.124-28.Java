package Lab06;

public class Child extends Parent{
    @Override
    public void setAndPrint(){
        System.out.print("Введите имя: ");
        setName(enterInfo());
        System.out.println("Имя: " + getName());
    }
}
