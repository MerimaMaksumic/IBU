//Create a program that reads numbers from the user and prints their sum. The program should stop asking for numbers when the user enters the number 0. The program should be structured like this:

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        int sum = 0;
        while(true){
            int number = new Scanner(System.in).nextInt();
            if (number == 0) break;
            sum += number;
            System.out.println("Sum now: " + sum);
        }
        System.out.println("Sum in the end: " + sum);
    }
}
