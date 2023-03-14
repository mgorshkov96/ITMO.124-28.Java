package Lab06;

public abstract class Human implements AskQuestion{
    private String name;
    private String surname;

    public Human(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public abstract void print();
}
