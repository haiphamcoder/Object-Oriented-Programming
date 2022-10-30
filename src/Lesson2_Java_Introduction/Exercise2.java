package Lesson2_Java_Introduction;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    private static int n;
    private static int[] a;

    public static void main(String[] args) {
        Input();
        Sort();
        PrintArray();
    }

    private static void Input() {
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.print("Enter the length of array: ");
            try {
                n = Integer.parseInt(keyboard.nextLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (n < 0);

        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            try {
                a[i] = Integer.parseInt(keyboard.nextLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void Sort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    private static void PrintArray() {
        System.out.println("Sorted array: " + Arrays.toString(a));
    }
}
