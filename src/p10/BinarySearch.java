package p10;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // Size of the array
        int[] a = new int[n]; // Initialize array of size n

        // Enter elements in the array in sorted order
        for(int i=0; i<a.length; i++)
            a[i] = in.nextInt();

        // Enter element to be searched
        System.out.println("Enter element to be searched");
        int element = in.nextInt();

        //Implementing binary search
        int first = 0;
        int last = n-1;
        int middle = (first + last)/2;

        while(first <= last){
            if(a[middle] == element){
                System.out.println("Element found at postition: " + (middle+1));
                break;
            }
            else if(a[middle]>element){
                last = middle - 1;
            }
            else{
                first = middle + 1;
            }
            middle = (first + last)/2;
        }
        if(first>last)
            System.out.println("Element is not in the list");
    }
}
