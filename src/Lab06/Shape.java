package Lab06;
import java.util.Scanner;

public class Shape {
    private int square;

    public int getSquare(){
        return square;
    }

    public void enterSquare(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите площадь: ");
        square = sc.nextInt();
    }
}
