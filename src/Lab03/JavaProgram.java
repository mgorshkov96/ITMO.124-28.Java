package Lab03;

class JavaProgram {
    public static void main(String[] args) {
        // Test Study
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());

        // Test Car
        Car bmw = new Car();
        Car vw = new Car("желтый");
        Car audi = new Car("белый", 2000.0d);
        bmw.setName("Bmw");
        vw.setName("Volkswagen");
        audi.setName("Audi");
        bmw.printCar();
        vw.printCar();
        audi.printCar();

        // Test House
        House myHouse = new House();
        myHouse.setProperties("Мой дом", 1970, 2);
        House parentsHouse = new House();
        parentsHouse.setProperties("Дом родителей", 1960, 5);
        myHouse.printHouse();
        parentsHouse.printHouse();

        // Test Tree
        Tree oak = new Tree();
        Tree birch = new Tree(15, "Береза");
        Tree pine = new Tree(13, true, "Сосна");
        System.out.println(birch.toString());
        System.out.println(pine.toString());
    }
}
