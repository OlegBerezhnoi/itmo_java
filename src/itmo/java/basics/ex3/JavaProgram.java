package itmo.java.basics.ex3;

class JavaProgram {


    public static void main(String[] args) {
        System.out.println("==================");
        System.out.println("JAVA");
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());

        System.out.println("==================");
        System.out.println("Авто");

        Car lada = new Car("синий");
        Car haval = new Car("черный", 1500d);
        lada.setName("Lada");
        lada.setWeight(1000d);
        haval.setName("Haval");
        lada.printCar();
        haval.printCar();

        System.out.println("==================");
        System.out.println("Дома");

        House firstHouse = new House();
        firstHouse.setValue("Дом на Невском", 1849, 3);
        House secondHouse = new House();
        secondHouse.setValue("Дом на Трибуца", 2017, 15);
        firstHouse.printHouse();
        secondHouse.printHouse();

        System.out.println("==================");
        System.out.println("Деревья");

        Tree palm = new Tree();
        Tree cherries = new Tree(5, "Черешня");
        Tree apple = new Tree(9, true, "Яблоня");
        System.out.println(cherries.toString());
        System.out.println(apple.toString());


    }



}