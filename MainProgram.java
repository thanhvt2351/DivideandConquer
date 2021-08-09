package SearchAndSort;

import java.util.Scanner;
import java.util.Random;

public class MainProgram {
    public static void main(String[] args) {
        // Input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = keyboard.nextInt();

        Random rd = new Random();

        int[] arr = new int[n];
        int count = 0;
        long sum = 0;

        // Import array
        // Loop 10 times
        while (count < 10) {
            count = count + 1;
            for (int i = 0; i < arr.length; i++) {
                // Import data A[]

                // Random
                // arr[i] = rd.nextInt(500000);

                // Sorted
                arr[i] = i + count;

                // Reverse
                // arr[i] = count + arr.length - i;

                // Nearly Sorted
                // if (i == arr.length / 2) {
                // arr[i] = count + n;
                // } else {
                // arr[i] = i + count;
                // }
            }
            keyboard.close();

            // Print before sort
            // System.out.print("Before Sort: ");
            // for (int i = 0; i < n; i++) {
            // System.out.print(arr[i] + " ");
            // }
            // System.out.println();

            // Sort
            long startTime = System.currentTimeMillis();

            MergeSort obj = new MergeSort();
            obj.mergeSort(arr, 0, arr.length - 1);

            long endTime = System.currentTimeMillis();

            // Print
            System.out.print("After Sort: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            long totalTime = endTime - startTime;
            sum = sum + totalTime;
            System.out.println();
            System.out.println("Running time " + count + " : " + totalTime + " milliseconds");
            System.out.println(Searching.binarySearch(arr, 0, arr.length - 1, 23));
            System.out.println(Searching.linearSearch(arr, 0, arr.length - 1, 23));
            System.out.println();
        }
        System.out.println("n = " + n + " Average running time :" + (sum / 10) + " milliseconds");
    }
}
