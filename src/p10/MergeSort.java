package p10;

import java.util.Scanner;

public class MergeSort {

    public static void merge(int[] left, int[] right, int[] arr){
        int i=0, j=0, k=0;

        // Merge elements by selecting minimum from left and right arrays
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements, if any, in either of the arrays
        while(i<left.length){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n<2)
            return;
        int mid = n/2;

        int[] left = new int[mid];
        int[] right = new int[n-mid];

        for(int i=0; i<left.length; i++)
            left[i] = arr[i];

        for(int i=0; i<right.length; i++)
            right[i] = arr[i+mid];

        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++)
            a[i] = in.nextInt();

        // Applying merge sort

        mergeSort(a);

        for(int x : a)
            System.out.print(x + " ");
        in.close();
    }
}
