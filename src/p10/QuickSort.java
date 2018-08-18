package p10;

import java.util.Random;
import java.util.Scanner;

public class QuickSort {

    public static int partition(int[] arr, int start, int end){
        int temp;
        int pivot = arr[end];
        int pIndex = start;
        for(int i=start; i<end; i++){
            if(arr[i]<=pivot){
                temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex++;
            }
        }
        temp = arr[end];
        arr[end] = arr[pIndex];
        arr[pIndex] = temp;
        return pIndex;
    }

    public static int randomizedPartition(int[] arr, int start, int end){
        Random rand = new Random();
        int pivotIndex = (int) (start +((end - start + 1) * Math.random()));
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[end];
        arr[end] = temp;
        return partition(arr, start, end);
    }

    public static void quicksort(int[] arr, int start, int end){
        if(start<end) {
            int pIndex = randomizedPartition(arr, start, end);
            quicksort(arr, start, pIndex - 1);
            quicksort(arr, pIndex + 1, end);
        }
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++)
            a[i] = in.nextInt();

        // Applying Quick sort

        quicksort(a, 0, n-1);

        for(int x : a)
            System.out.print(x + " ");
        in.close();
    }
}
