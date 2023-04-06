package itmo.java.basics.ex6;

public class JavaPrograms {
    public static void main(String[] args){
        System.out.println("=======Task1");
        Client client = new Client("Петр", "Петров", "Ренессанс");
        client.print();
        BankEmployee employee = new BankEmployee("Игорь", "Сидоров", "Открытие");
        employee.print();

        System.out.println("\n=========Task2");
        client.printQuestion();
        employee.printQuestion();

        System.out.println("\n=========Task3");
        Truck kamaz = new Truck(5000, "master", 'o', 150.0f, 6000, 6);
        kamaz.outPut();
        kamaz.newWheels(8);

        System.out.println("\n===========Task4");
        Triangle abc = new Triangle();
        abc.enterSquare();
        abc.printSquare();

        System.out.println("\n===========Task5");
        Parent vladimir = new Parent();
        vladimir.setAndPrint();
        Child victor = new Child();
        victor.setAndPrint();
    }
}
