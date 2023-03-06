package Lab03;

public class Tree {
    private Integer age;
    private Boolean isAlive;
    private String name;
    public Tree(Integer age, String name){
        this.age = age;
        this.name = name;
    }
    public Tree(Integer age, Boolean isAlive, String name){
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }
    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал");
    }
    @Override
    public String toString(){
        return "Имя - " + name + "; Живое(true/false) - " + isAlive + "; Возраст - " + age;
    }
}
