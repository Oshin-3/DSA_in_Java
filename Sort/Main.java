package com.Sort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("---------- MENU ----------");
        System.out.println("Select Sorting Algorithm: \n1. Bubble Sort\n2. Selection Sort");
        int choice = sc.nextInt();

        System.out.println("Enter length of the array: ");
        int len = sc.nextInt();

        System.out.println("Enter values in the array: ");
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        switch (choice)
        {
            case 1: BubbleSort bubbleSort = new BubbleSort();
                    bubbleSort.bubbleSort(arr);
                    break;
            case 2: SelectionSort selectionSort = new SelectionSort();
                    selectionSort.selectionSort(arr);
                    break;
            default:
                System.out.println("Invalid input");
        }

    }
}
