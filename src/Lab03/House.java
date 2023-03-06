package Lab03;

import java.time.format.DateTimeFormatter;

public class House {
    private String name;
    private Integer buildingYear;
    private Integer numberOfFloors;
    public void setProperties(String name, Integer buildingYear, Integer numberOfFloors){
        this.name = name;
        this.buildingYear = buildingYear;
        this.numberOfFloors = numberOfFloors;
    }
    public void printHouse(){
        System.out.println("\nИнформация о доме:" + "\n" +
                "Наименование - " + name + "\n" +
                "Год постройки - " + buildingYear + "\n" +
                "Количество этажей - " + numberOfFloors);
    }
    public Integer yearsFromConstructions(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        java.time.LocalDate thisDate = java.time.LocalDate.now();
        Integer thisYear = Integer.parseInt(thisDate.format(formatter));
        Integer diffYear = thisYear - buildingYear;
        return diffYear;
    }

}
