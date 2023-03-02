package Lab02;

public class Main {
    public static void main(String[] args){
        // Test Calculator
        Calculator.addition(2,2);
        Calculator.addition(4.65d,0.23d);
        Calculator.addition(90000000L,123456789L);
        Calculator.division(18,0);
        Calculator.division(120d,20d);
        Calculator.division(90000000L,30000000L);
        Calculator.multiplication(5,5);
        Calculator.multiplication(4.65d,0.23d);
        Calculator.multiplication(90000000L,123456789L);
        Calculator.subtraction(100,50);
        Calculator.subtraction(128.33d,5.69d);
        Calculator.subtraction(129000000000L,5L);

        // Test Employee
        Employee ivanovPavel = new Employee();
        ivanovPavel.setName("Павел");
        ivanovPavel.setSurname("Иванов");
        ivanovPavel.setDepartment("Бухгалтерия");
        System.out.println(ivanovPavel);

        Employee komarovIvan = new Employee("Иван", "Комаров", 24, "Юр. отдел", "komarov@test.ru", "+79210002211",
                82750.55d);
        System.out.println(komarovIvan);
    }
}
