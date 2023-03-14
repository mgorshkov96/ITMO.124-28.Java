package Lab06;

public class Client extends Human {
    private String bankName;

    public Client(String name, String surname, String bankName){
        super(name,surname);
        this.bankName = bankName;
    }
    @Override
    public void print(){
        System.out.println("--Client");
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Bank name: " + bankName);
    }

    @Override
    public String question(){
        return "Здравствуйте! Как мне получить услугу?";
    }

    @Override
    public void printQuestion(){
        System.out.println(question());
    }
}
