package p10;

import java.util.Scanner;

public class NarcissisticNumber {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        // Enter the number of digits
        int n = in.nextInt();

        // Enter the number
        int num = in.nextInt();
        int temp = num;

        // An n-digit number that is the sum of the nth powers of its digits is narcissistic number.
        // Separate the digit and sum their nth power
        int digitSum = 0;
        for(int i=0; i<n; i++){
            digitSum += Math.pow(temp%10, n);
            temp /= 10;
        }

        if(digitSum == num)
            System.out.println("Narcissistic number");
        else
            System.out.println("Not an narcissistic number");

        in.close();
    }
}
