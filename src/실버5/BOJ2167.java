package 실버5;

import java.util.Scanner;

public class BOJ2167 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[][] arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();

        for (int r = 0; r < k; r++) {
            int sum = 0;
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            for (int row = i - 1; row < x; row++) {
                for (int col = j - 1; col < y; col++) {
                    sum += arr[row][col];
                }
            }
            System.out.println(sum);
        }
    }
}