package itmo.java.basics.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");

        double x = (46+10)*(10d/3);
        System.out.println(x);

        long y = 29*4*(-15);
        System.out.println(y);

        int number = 10500;
        double result = (number/10.0)/10;
        System.out.println(result);

        double x1 = 3.6;
        double x2 = 4.1;
        double x3 = 5.9;
        double result2 = x1 * x2 * x3;
        System.out.println(result2);

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
        int num2 = scanner.nextInt();
        System.out.println(num2);
        int num3 = scanner.nextInt();
        System.out.println(num3);

        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        System.out.println(b);

        if (b % 2 != 0) {
            System.out.println("Нечетное");
        }
        else if (b > 100) {
            System.out.println("Выход за пределы диапазона");
        }
        else {
            System.out.println("Четное");
        }



    }
}
