package itmo.java.basics.ex2;

public class Main {
    public static void main(String[] args) {

        Calculator.Sum(15, 14);
        Calculator.Sum(5.58d, 0.16d);
        Calculator.Sum(65000000L, 15526669635L);
        Calculator.division(16, 0);
        Calculator.division(78d, 15d);
        Calculator.division(80000000L, 20000000L);
        Calculator.multiplication(7, 8);
        Calculator.multiplication(9.99d, 0.15d);
        Calculator.multiplication(70000000L, 223456789L);
        Calculator.subtraction(50, 20);
        Calculator.subtraction(135.1d, 4.78d);
        Calculator.subtraction(75850000000L, 5L);

        RealEstate flat = new RealEstate();
        flat.setPlace("Saint-Petersburg");
        flat.setApartment(true);
        flat.setCategory("business");
        flat.setPrice(50000000L);
        System.out.println(flat);

        RealEstate house = new RealEstate("Sochi", false, "economy", 2, 100.25d, 3000000L);
        System.out.println(house);

    }
}
