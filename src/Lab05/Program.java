package Lab05;

import sun.security.util.ArrayUtil;

import java.util.Arrays;

public class Program {
    public static void main(String[] args){
        System.out.println("## Exercise1");
        String exampleString = "Сложно сказать, почему многие известные личности освещают чрезвычайно интересные " +
                "особенности картины в целом, однако конкретные выводы, разумеется, объединены в целые кластеры " +
                "себе подобных. Для современного мира сплочённость команды профессионалов играет важную роль в " +
                "формировании переосмысления внешнеэкономических политик.";
        String word = longestWord(exampleString);
        System.out.println("Самое длинное слово: " + word);

        System.out.println("## Exercise2");
        checkPalindrome("каРтошка ");
        checkPalindrome("ротор");

        System.out.println("## Exercise3");
        changeSubstring("Строка, где слово бяка надо цензурировать. Потому-что слово бяка под запретом",
                "Бяка");

        System.out.println("## Exercise4");
        int checkRabbit = checkSubstring("Вышел зайчик погулять", "Зай");
        System.out.println("Подстрока входит в строку " + checkRabbit + " раз(а)");
        int checkSasha = checkSubstring("Шла Саша по шоссе и сосала сушку", "Са");
        System.out.println("Подстрока входит в строку " + checkSasha + " раз(а)");

        System.out.println("## Exercise5");
        String testString = "This is a test string";
        System.out.println("Исходная строка: " + testString);
        System.out.println("Инвертированная строка: " + invertWords(testString));
    }

    public static String longestWord(String string){
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

    public static void checkPalindrome(String string){
        StringBuilder reverseString = new StringBuilder(string);
        reverseString.reverse();

        if (string.equalsIgnoreCase(String.valueOf(reverseString))){
            System.out.println(string + " - полиндром");
        } else {
            System.out.println(string + " - не полиндром");
        }
    }

    public static void changeSubstring(String string, String substring){
        System.out.println(string.toLowerCase().replaceAll(substring.toLowerCase(), "[вырезано цензурой]"));
    }

    public static int checkSubstring(String string, String substring){

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
