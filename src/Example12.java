import java.util.Scanner;

public class Example12 {
    public static void main(String [] argv) {
        int number1;
        int number2;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Write first number");
        number1 = inputValue.nextInt();

        System.out.println("Write second number");
        number2 = inputValue.nextInt();

        if(number1 > number2) {
            System.out.println("first number is biggest");
        } else {
            System.out.println("Second number is biggest");
        }
    }
}
