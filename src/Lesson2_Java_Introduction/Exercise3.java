package Lesson2_Java_Introduction;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Nhap chieu cao (2-10): ");
            try {
                n = Integer.parseInt(keyboard.nextLine());
                if (n <= 10 && n >= 2) {
                    break;
                } else {
                    System.out.println("Chieu cao nam ngoai pham vi! Hay nhap lai!");
                }
            } catch (Exception e) {
                System.out.println("Loi roi! Hay nhap lai!");
            }
        }
        System.out.println();
        int length = 2 * n - 1;
        for (int i = 1; i <= n; i++) {
            int numberStar = 2 * i - 1;
            int numberSpace = (length - numberStar) / 2;
            printCharacter(' ', numberSpace);
            printCharacter('*', numberStar);
            printCharacter(' ', numberSpace);
            System.out.println();
        }
    }

    public static void printCharacter(char x, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(x + " ");
        }
    }
}
