package p10;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++)
            a[i] = in.nextInt();

        // Applying bubble sort
        int flag;
        for(int i=0; i<n-1; i++){
            flag = 0;
            for(int j=0; j<n-i-1; j++){
                if(a[j]>a[j+1]){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                    flag = 1;
                }
            }
            if(flag == 0)
                break;;
        }


        for(int x : a)
            System.out.print(x + " ");
        in.close();
    }
}
