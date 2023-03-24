package itmo.java.basics.ex2;


public class Calculator {
    public static void Sum(int firstNumber, int secondNumber) {
        int answer = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + answer);
    }

    public static void Sum(double firstNumber, double secondNumber) {
        double answer = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + answer);
    }

    public static void Sum(long firstNumber, long secondNumber) {
        long answer = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + answer);
    }

    public static void division(int firstNumber, int secondNumber) {
        if (secondNumber != 0) {
            double answer = (double) firstNumber / (double) secondNumber;
            System.out.println(firstNumber + " / " + secondNumber + " = " + answer);
        } else {
            System.out.println("Ошибка: на ноль делить нельзя");
        }
    }

    public static void division(double firstNumber, double secondNumber) {
        if (secondNumber != 0) {
            double answer = firstNumber / secondNumber;
            System.out.println(firstNumber + " / " + secondNumber + " = " + answer);
        } else {
            System.out.println("Ошибка: на ноль делить нельзя");
        }
    }

    public static void division(long firstNumber, long secondNumber) {
        if (secondNumber != 0) {
            double answer = (double) firstNumber / (double) secondNumber;
            System.out.println(firstNumber + " / " + secondNumber + " = " + answer);
        } else {
            System.out.println("Ошибка: на ноль делить нельзя");
        }
    }

    public static void multiplication(int firstNumber, int secondNumber) {
        int answer = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + answer);
    }

    public static void multiplication(double firstNumber, double secondNumber) {
        double answer = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + answer);
    }

    public static void multiplication(long firstNumber, long secondNumber) {
        long answer = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + answer);
    }

    public static void subtraction(int firstNumber, int secondNumber) {
        int answer = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + answer);
    }

    public static void subtraction(double firstNumber, double secondNumber) {
        double answer = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + answer);
    }

    public static void subtraction(long firstNumber, long secondNumber) {
        long answer = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + answer);
    }
}