package Lab06;

public class Program {
    public static void main(String[] args){
        System.out.println("##Exercise1");
        Client client = new Client("Иван", "Иванов", "Сбербанк");
        client.print();
        BankEmployee employee = new BankEmployee("Сергей", "Сергеев", "Тинькофф");
        employee.print();

        System.out.println("\n##Exercise2");
        client.printQuestion();
        employee.printQuestion();

        System.out.println("\n##Exercise3");
        Truck kamaz = new Truck(5000, "master", 'o', 150.0f, 6000, 6);
        kamaz.outPut();
        kamaz.newWheels(8);

        System.out.println("\n##Exercise4");
        Triangle abc = new Triangle();
        abc.enterSquare();
        abc.printSquare();

        System.out.println("\n##Exercise5");
        Parent vladimir = new Parent();
        vladimir.setAndPrint();
        Child victor = new Child();
        victor.setAndPrint();
    }
}
