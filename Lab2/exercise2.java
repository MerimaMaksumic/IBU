//Create a program that asks the user for three numbers and then prints their sum. Use the following structure in your program:
import java.util.Scanner;

public class exercise2 {
    public static int requestNumber(String text){
        Scanner reader = new Scanner(System.in);
        System.out.print(text);
        return reader.nextInt();
    }
    public static int calculateSum(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] numbers = {requestNumber("Type the first number: "),
                         requestNumber("Type the second number: "),
                         requestNumber("Type the third number: ")};

        System.out.println("Sum: " + calculateSum(numbers) );
    }
}
