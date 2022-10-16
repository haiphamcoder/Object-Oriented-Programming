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
        int maxH = n, maxC = n, minC = 1, minH = 1, value = 1;
        while (value <= n * n) {
            // Hang tren cung chua ghi
            for (int i = minC; i <= maxC; i++) {
                x[minH][i] = value++;
            }
            minH++;

            // Cot phai cung chua ghi
            for (int i = minH; i <= maxH; i++) {
                x[i][maxC] = value++;
            }
            maxC--;

            // Hang duoi cung chua ghi
            for (int i = maxC; i >= minC; i--) {
                x[maxH][i] = value++;
            }
            maxH--;

            // Cot trai cung chua ghi
            for (int i = maxH; i >= minH; i--) {
                x[i][minC] = value++;
            }
            minC++;
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
