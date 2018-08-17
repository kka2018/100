package p10;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++)
            a[i] = in.nextInt();

        // Applying Insertion sort
        int value;
        int hole;
        for(int i=1; i<n; i++){
            value = a[i];
            hole = i;
            while(hole>0 && a[hole-1]>value){
                a[hole] = a[hole-1];
                hole--;
            }
            a[hole] = value;
        }

        // print array
        for(int x : a)
            System.out.print(x + " ");
        in.close();
    }
}
