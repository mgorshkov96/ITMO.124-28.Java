package Lab04;
import java.util.Arrays;

public class Program {
    public static void main(String[] args){
        System.out.println("## Part1Ex1");
        oddNumbers();

        System.out.println("## Part1Ex2");
        threeOrFiveOrBoth();

        System.out.println("## Part1Ex3");
        System.out.println(checkSum(5, 10, 15));
        System.out.println(checkSum(5, 10, 16));

        System.out.println("## Part1Ex4");
        System.out.println(checkInequality(5, 10, 15));
        System.out.println(checkInequality(5, 15, 10));

        System.out.println("## Part1Ex5");
        int[] myArray = {2, 3, 5, 8, 9, 568, 999, 3};
        System.out.println(isThreeContained(myArray));

        System.out.println("## Part1Ex6");
        int[] myArray2 = {2, 3, 5, 8, 9, 568, 999, 3, 1, 2, 0, 1985};
        System.out.println(isThreeOreOneContained(myArray2));

        System.out.println("## Part2Ex1");
        int[] sortedArray = {1, 2, 2, 3, 4, 6, 9, 11, 11, 14};
        int[] unsortedArray = {2, 1, 43, 29, 0, 15};
        checkSortArray(sortedArray);
        checkSortArray(unsortedArray);

        System.out.println("## Part2Ex2");
        int[] testArray = {312, 432, 3, 14, 3412, 33, 31, 0, 2312, 342};
        printArray(testArray);

        System.out.println("## Part2Ex3");
        changeArrayValues(testArray);

        System.out.println("## Part2Ex4");
        int[] arrayWithUniqueValues = {1, 2, 3, 1, 2, 4};
        int[] arrayWithoutUniqueValues = {1, 1, 2, 2, 5, 5, 6, 7, 7, 6};
        searchFirstUniqueValue(arrayWithUniqueValues);
        searchFirstUniqueValue(arrayWithoutUniqueValues);
    }

    public static void oddNumbers(){
        for (int i = 1; i <= 99; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public static void threeOrFiveOrBoth(){
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

    public static Boolean checkInequality(int firstNumber, int secondNumber, int thirdNumber){
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

    public static Boolean isThreeOreOneContained(int[] ints){
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
        System.out.print("Array 1: ");
        for (int number : ints){
            System.out.print(number + ", ");
        }

        int firstValue = ints[0];
        int lastValue = ints[ints.length - 1];
        ints[0] = lastValue;
        ints[ints.length - 1] = firstValue;

        System.out.print("\nArray 2: ");
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
