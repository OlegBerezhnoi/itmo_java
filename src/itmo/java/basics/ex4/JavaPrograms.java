package itmo.java.basics.ex4;
import java.util.Arrays;
public class JavaPrograms {
    public static void main(String[] args){
        System.out.println("===============");
        System.out.println("===============");
        System.out.println("Part1");
        System.out.println("Task1");

        addNumbers();
        System.out.println("===============");
        System.out.println("Task2");
        isDivided();
        System.out.println("===============");
        System.out.println("Task3");
        System.out.println(checkSum(5, 10, 15));
        System.out.println(checkSum(5, 10, 20));
        System.out.println("===============");
        System.out.println("Task4");
        System.out.println(comparison(5, 10, 15));
        System.out.println(comparison(5, 15, 9));
        System.out.println("===============");
        System.out.println("Task5");
        int[] myArray = {7, 8, 45, 8, 16, 568, 600, 3};
        System.out.println(isThreeContained(myArray));
        System.out.println("===============");
        System.out.println("Task6");
        int[] myArray2 = {78, 3, 5, 14, 9, 568, 999, 3, 1, 2, 12, 11};
        System.out.println(isThreeOrOneContained(myArray2));

        System.out.println("===============");
        System.out.println("Part2");
        System.out.println("Task1");

        int[] sortedArray = {1, 2, 2, 3, 4, 6, 9, 11, 11, 14};
        int[] unsortedArray = {7, 2, 14, 17, 18, 66};
        checkSortArray(sortedArray);
        checkSortArray(unsortedArray);
        System.out.println("===============");
        System.out.println("Task2");
        int[] testArray = {17, 14, 55, 89, 785, 85, 25, 14, 0, 16};
        printArray(testArray);
        System.out.println("===============");
        System.out.println("Task3");
        changeArrayValues(testArray);
        System.out.println("===============");
        System.out.println("Task4");
        int[] arrayWithUniqueValues = {1, 2, 3, 1, 2, 4};
        int[] arrayWithoutUniqueValues = {7, 8, 6, 2, 5, 4, 6, 7, 8, 4};
        searchFirstUniqueValue(arrayWithUniqueValues);
        searchFirstUniqueValue(arrayWithoutUniqueValues);
    }

    public static void addNumbers(){
        for (int i = 1; i <= 99; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public static void isDivided(){
        System.out.print("Делится на 3: ");
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 != 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println();

        System.out.print("Делится на 5: ");
        for (int i = 1; i <= 100; i++){
            if (i % 3 != 0 && i % 5 == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println();

        System.out.print("Делится на 3 и на 5: ");
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    public static Boolean checkSum(int firstNumber, int secondNumber, int thirdNumber){
        if (firstNumber + secondNumber == thirdNumber){
            return true;
        }
        else {
            return false;
        }
    }

    public static Boolean comparison(int firstNumber, int secondNumber, int thirdNumber){
        if (secondNumber > firstNumber && thirdNumber > secondNumber){
            return true;
        }
        else{
            return false;
        }
    }

    public static Boolean isThreeContained(int[] ints){
        System.out.println("array: " + Arrays.toString(ints));
        if (ints[0] == 3 || ints[ints.length - 1] == 3){
            return true;
        } else {
            return false;
        }
    }

    public static Boolean isThreeOrOneContained(int[] ints){
        Boolean result = false;
        for (int number : ints){
            if (number == 1 || number == 3){
                result = true;
                break;
            }
        }
        return result;
    }

    public static void checkSortArray(int[] ints){
        Boolean isSort = true;
        int checkNumber = ints[0];
        for (int i = 1; i < ints.length; i++){
            if (checkNumber <= ints[i]){
                checkNumber = ints[i];
            } else {
                isSort = false;
                break;
            }
        }

        if (isSort){
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }

    public static void printArray(int[] testArray){
        StringBuilder stringArray = new StringBuilder("Result: ");
        for (int number : testArray){
            stringArray.append(Integer.toString(number) + ", ");
        }
        System.out.println(stringArray);
    }

    public static void changeArrayValues(int[] ints){
        System.out.print("\n Array 1: ");
        for (int number : ints){
            System.out.print(number + ", ");
        }

        int firstValue = ints[0];
        int lastValue = ints[ints.length - 1];
        ints[0] = lastValue;
        ints[ints.length - 1] = firstValue;

        System.out.print("\n Array 2: ");
        for (int number : ints){
            System.out.print(number + ", ");
        }
        System.out.println();
    }

    public static void searchFirstUniqueValue(int[] ints){
        int checkingValue;
        Boolean isUniqueExists = false;

        for (int number : ints){
            checkingValue = 0;
            for (int value : ints){
                if (number == value){
                    checkingValue++;
                }
            }
            if (checkingValue == 1){
                isUniqueExists = true;
                System.out.println("Первое уникальное значение: " + Integer.toString(number));
                break;
            }
        }
        if (!isUniqueExists){
            System.out.println("В массиве отсутствуют уникальные значения");
        }
    }
}
