package Lab06;

public class BankEmployee extends Human {
    private String bankName;

    public BankEmployee(String name, String surname, String bankName){
        super(name,surname);
        this.bankName = bankName;
    }

    @Override
    public void print(){
        System.out.println("--Employee");
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Bank name: " + bankName);
    }

    @Override
    public String question(){
        return "Здравствуйте! Чем могу помочь?";
    }

    @Override
    public void printQuestion(){
        System.out.println(question());
    }
}
