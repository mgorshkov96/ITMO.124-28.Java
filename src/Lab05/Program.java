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
        longestWord(exampleString);

        System.out.println("## Exercise2");
        checkPalindrome("каРтошка ");
        checkPalindrome("ротор");

        System.out.println("## Exercise3");
        changeSubstring("Строка, где слово бяка надо цензурировать. Потому-что слово бяка под запретом",
                "Бяка");

        System.out.println("## Exercise4");
        checkSubstring("Вышел зайчик погулять", "Зай");
        checkSubstring("Шла Саша по шоссе и сосала сушку", "Са");

        System.out.println("## Exercise5");
        invertWords("This is a test string");
    }

    public static void longestWord(String string){
        String result = "";
        String cleanString = string.replaceAll("[!\"#$%&'()*+,-./:;<=>?\\[\\]^_`{|}~]", "");
        String[] words = cleanString.split(" ");
        for (String word : words){
            if (word.length() > result.length()){
                result = word;
            }
        }
        System.out.println("Самое длинное слово: " + result);
    }

    public static void checkPalindrome(String string){
        char[] stringChars = string.trim().toLowerCase().toCharArray();
        char[] reverseStringChars = new char[stringChars.length];

        for (int i = 0, j = stringChars.length - 1; i < stringChars.length; i++, j--){
            reverseStringChars[j] = stringChars[i];
        }

        int counter = 0;
        for (int i = 0; i < stringChars.length; i++){
            if (stringChars[i] != reverseStringChars[i]){
                counter++;
            }
        }

        if (counter == 0){
            System.out.println(string.trim().toLowerCase() + " - полиндром");
        } else {
            System.out.println(string.trim().toLowerCase() + " - не полиндром");
        }
    }

    public static void changeSubstring(String string, String substring){
        System.out.println(string.toLowerCase().replaceAll(substring.toLowerCase(), "[вырезано цензурой]"));
    }

    public static void checkSubstring(String string, String substring){

        char[] stringChars = string.toLowerCase().replaceAll(substring.toLowerCase(), "1").toCharArray();
        int counter = 0;
        for (char symbol : stringChars){
            if (symbol == '1'){
                counter++;
            }
        }
        System.out.println("Подстрока " + '"' + substring + '"' + " входит в строку " + '"' + string + '"' +
                " " + counter + " раз(а)");
    }

    public static void invertWords(String string){
        String[] stringChars = string.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : stringChars){
            char[] symbols = word.toCharArray();
            for (int i = symbols.length - 1; i >= 0; i--){
                result.append(symbols[i]);
            }
            result.append(" ");
        }

        System.out.println("Исходная строка: " + string);
        System.out.println("Инвертированная строка: " + String.valueOf(result).trim());
    }
}
