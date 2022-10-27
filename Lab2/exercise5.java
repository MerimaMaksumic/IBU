//Create a program that calculates the sum of 20+21+22+...+2n, where n is a number entered by the user. The notation 2i means raising the number 2 to the power of i, for example 24 = 2*2*2*2 = 16. In Java we cannot write ab directly, but instead we can calculate the power with the command Math.pow(number, power). Note that the command returns a number of double type (i.e. floating point number). A double can be converted into the int type (i.e. whole number) as follows: int result = (int)Math.pow(2, 3). This assigns the value of 23 to variable result. 

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        System.out.print("Type a number: ");
        int n = new Scanner(System.in).nextInt();
        int result = 0;
        for (int i = 0; i <= n; i++){
            result += Math.pow(2, i);
        }
        System.out.println("The result is: " + result);
    }
}