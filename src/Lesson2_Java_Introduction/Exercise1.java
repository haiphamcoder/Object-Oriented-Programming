package Lesson2_Java_Introduction;

import java.util.Arrays;
import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        randomize(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void randomize(int[] arr) {
        Random rd = new Random();
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            int j = rd.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
