package Lesson2_Java_Introduction;

import java.util.Scanner;

public class Exercise3 {
    private static int n;

    public static void main(String[] args) {
        Input();
        PrintTriangle();
    }

    private static void Input() {
        Scanner keyboard = new Scanner(System.in);
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
    }

    private static void PrintTriangle() {
        System.out.println();
        int numberSpace = n - 1;
        int numberStar = 1;
        for (int i = 1; i <= n; i++) {
            printCharacter(' ', numberSpace--);
            printCharacter('*', numberStar);
            numberStar += 2;
            System.out.println();
        }
    }

    private static void printCharacter(char x, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(x + " ");
        }
    }
}
