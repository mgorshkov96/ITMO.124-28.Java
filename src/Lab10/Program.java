package Lab10;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.*;

public class Program {
    public static void main(String[] args){
        System.out.println("##Exercise1");
        File text = new File("files/text.txt");
        System.out.println(readText(text));

        System.out.println("##Exercise2");
        File hello = new File("files/hello.txt");
        writeText("Hello world!", hello);
        System.out.println(readText(hello));

        System.out.println("##Exercise3");
        File firstFile = new File("files/firstFile.txt");
        File secondFile = new File("files/secondFile.txt");
        File thirdFile = mergeFiles(firstFile, secondFile, "files/thirdFile.txt");
        System.out.println(readText(thirdFile));

        System.out.println("##Exercise4");
        File fileWithoutSymbols = new File("files/symbol.txt");
        String textWithoutSymbols = "Значимость этих проблем настолько очевидна, что выбранный нами инновационный путь, в своём " +
                "классическом представлении, допускает внедрение системы массового участия. Разнообразный и богатый " +
                "опыт говорит нам, что выбранный нами инновационный путь представляет собой интересный эксперимент " +
                "проверки переосмысления внешнеэкономических политик.";
        writeText(textWithoutSymbols, fileWithoutSymbols);
        System.out.println("До:");
        System.out.println(readText(fileWithoutSymbols));
        changeSymbols(fileWithoutSymbols);
        System.out.println("После:");
        System.out.println(readText(fileWithoutSymbols));
    }
    public static List<String> readText(File file){
        List<String> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = reader.readLine()) != null){
                result.add(input);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return result;
    }

    public static void writeText(List<String> strings, File file){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            for (String s : strings) {
                writer.write(s);
            }
        } catch (IOException e){
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void writeText(String string, File file){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            writer.write(string);
        } catch (IOException e){
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static File mergeFiles(File firstFile, File secondFile, String path){
        File file = new File(path);
        List<String> firstList = readText(firstFile);
        List<String> secondList = readText(secondFile);
        List<String> result = new ArrayList<>();

        for (String firstStrings : firstList) {
            result.add(firstStrings);
        }

        for (String secondStrings : secondList) {
            result.add(secondStrings);
        }

        writeText(result, file);
        return file;
    }

    public static void changeSymbols(File file){
        List<String> list = readText(file);
        List<String> result = new ArrayList<>();
        for (String str : list){
            result.add(String.valueOf(str).replaceAll("[^0-9а-яА-Я]", "\\$"));
        }
        writeText(result, file);
    }
}
