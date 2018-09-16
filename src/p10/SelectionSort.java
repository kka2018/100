package p10;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++)
            a[i] = in.nextInt();

        // Applying selection sort

        int imin;
        int temp;
        for(int i=0; i<n-1; i++){
            imin = i;
            for(int j=i+1; j<n; j++){
                if(a[j] < a[imin])
                    imin = j;
            }
            temp = a[i];
            a[i] = a[imin];
            a[imin] = temp;
        }


        for(int x : a)
            System.out.print(x + " ");
        in.close();
    }
}
