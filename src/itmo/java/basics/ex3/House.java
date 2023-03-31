package itmo.java.basics.ex3;

import java.time.format.DateTimeFormatter;

public class House {
    private String name;
    private Integer yearConstruction;
    private Integer numFloors;

    private DateTimeFormatter years;

    public void setValue(String name, Integer yearConstruction, Integer numFloors) {
        this.name = name;
        this.yearConstruction = yearConstruction;
        this.numFloors = numFloors;
    }

    public void printHouse() {
        System.out.println("Объект:" + "\n" +
                "Наименование:" + name + "\n" +
                "Год постройки:" + yearConstruction + "\n" +
                "Количество этажей:" + numFloors);
    }

    public Integer yearsFromConstr() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        java.time.LocalDate thisDate = java.time.LocalDate.now();
        Integer thisYear = Integer.parseInt(thisDate.format(formatter));
        Integer years = thisYear - yearConstruction;
        return years;

    }


}



