package Lab02;

public class Employee {
    private String name;
    private String surname;
    private Integer age;
    private String department;
    private String email;
    private String phone;
    private Double salary;

    public Employee(){}

    public Employee(String name, String surname, Integer age, String department, String email, String phone,
                    Double salary){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.department = department;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public Double getSalary(){
        return salary;
    }
    public void setSalary(Double salary){
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "\nИнформация о сотруднике\n" +
                "Фамилия: " + surname + "\n" +
                "Имя: " + name + "\n" +
                "Возвраст: " + age + "\n" +
                "Отдел: " + department + "\n" +
                "Эл. почта: " + email + "\n" +
                "Телефон: " + phone + "\n" +
                "Зар. плата: " + salary;
    }
}
