package Lesson2_Java_Introduction;

import java.util.Scanner;

public class Exercise4 {
    private static int[][] x;
    private static int n;

    public static void main(String[] args) {
        Input();
        CompleteMatrix();
        PrintMatrix();
    }

    private static void Input() {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhap kich thuoc cua o vuong (3<=n<=8): ");
                n = Integer.parseInt(keyboard.nextLine());
                if (n >= 3 && n <= 8) {
                    break;
                } else {
                    System.out.println("Ngoai mien gia tri! Vui long nhap lai!");
                }
            } catch (Exception e) {
                System.out.println("Khong hop le! Vui long nhap lai!");
            }
        }
    }

    private static void CompleteMatrix() {
        x = new int[n + 1][n + 1];
        int maxRow = n, maxCol = n, minCol = 1, minRow = 1, value = 1;
        while (value <= n * n) {
            // Hang tren cung chua ghi
            for (int i = minCol; i <= maxCol; i++) {
                x[minRow][i] = value++;
            }
            minRow++;

            // Cot phai cung chua ghi
            for (int i = minRow; i <= maxRow; i++) {
                x[i][maxCol] = value++;
            }
            maxCol--;

            // Hang duoi cung chua ghi
            for (int i = maxCol; i >= minCol; i--) {
                x[maxRow][i] = value++;
            }
            maxRow--;

            // Cot trai cung chua ghi
            for (int i = maxRow; i >= minRow; i--) {
                x[i][minCol] = value++;
            }
            minCol++;
        }
    }


    private static void PrintMatrix() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%-5d", x[i][j]);
            }
            System.out.println();
        }
    }
}
