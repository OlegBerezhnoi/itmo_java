package itmo.java.basics.ex5;
import java.util.Arrays;
public class JavaPrograms {
    public static void main(String[] args){
        System.out.println("======Task1");
        String exampleString = "Программи́рование — процесс создания компьютерных программ." +
                "По выражению одного из основателей языков программирования Никлауса Вирта «Программы = алгоритмы + структуры данных» " +
                "Программирование основывается на использовании языков программирования, на которых записываются исходные тексты программ. " +
                "205 год до н. э.[3] (150 год до н. э.[4]) — антикитерский механизм из Древней Греции был калькулятором, использовавшим шестерни различных размеров и конфигурации, обусловливающих его работу[5], по отслеживанию метонова цикла, до сих пор использующегося в лунно-солнечных календарях[6].";
        String word = longest(exampleString);
        System.out.println("Самое длинное слово: " + word);

        System.out.println("=======Task2");
        isPalindrome("процесс ");
        isPalindrome("казак");

        System.out.println("========Task3");
        change(" Смотри, какие лапки грязные, — бяка!",
                "бяка");

        System.out.println("========Task4");
        int checklav = checkSubstr("Тридцать три корабля лавировали, лавировали, да не вылавировали.", "лав");
        System.out.println("Подстрока входит в строку " + checklav + " раз(а)");
        int checkvod = checkSubstr("20000 лье под водой", "вод");
        System.out.println("Подстрока входит в строку " + checkvod + " раз(а)");

        System.out.println("========Task5");
        String testString = "This is a test string";
        System.out.println("Исходная строка: " + testString);
        System.out.println("Инвертированная строка: " + invertWords(testString));
    }

    public static String longest(String string){
        String result = "";
        String cleanString = string.replaceAll("[!\"#$%&'()*+,-./:;<=>?\\[\\]^_`{|}~]", "");
        String[] words = cleanString.split(" ");
        for (String word : words){
            if (word.length() > result.length()){
                result = word;
            }
        }
        return result;
    }

    public static void isPalindrome(String string){
        StringBuilder reverseString = new StringBuilder(string);
        reverseString.reverse();

        if (string.equalsIgnoreCase(String.valueOf(reverseString))){
            System.out.println(string + " - полиндром");
        } else {
            System.out.println(string + " - не полиндром");
        }
    }

    public static void change(String string, String substring){
        System.out.println(string.toLowerCase().replaceAll(substring.toLowerCase(), "[вырезано цензурой]"));
    }

    public static int checkSubstr(String string, String substring){

        char[] stringChars = string.toLowerCase().replaceAll(substring.toLowerCase(), "1").toCharArray();
        int counter = 0;
        for (char symbol : stringChars){
            if (symbol == '1'){
                counter++;
            }
        }
        return counter;
    }

    public static String invertWords(String string){
        String[] stringChars = string.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : stringChars){
            char[] symbols = word.toCharArray();
            for (int i = symbols.length - 1; i >= 0; i--){
                result.append(symbols[i]);
            }
            result.append(" ");
        }
        return String.valueOf(result).trim();
    }
}
