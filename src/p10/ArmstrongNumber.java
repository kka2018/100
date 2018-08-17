package p10;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        // Enter the number of digits
        int n = in.nextInt();

        // Enter the number
        int num = in.nextInt();
        int temp = num;

        // Separate the digit and sum their cubes
        int digitSum = 0;
        for(int i=0; i<n; i++){
            digitSum += Math.pow(temp%10, 3);
            temp /= 10;
        }

        if(digitSum == num)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an armstrong number");

        in.close();
    }
}
