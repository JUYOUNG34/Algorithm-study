package 실버2;

import java.util.Scanner;

public class BOJ2630 {
    static int[][] B;
    static int wCnt;
    static int bCnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        wCnt = 0;
        bCnt = 0;
        B = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        myExecute(0, 0, N);
        System.out.println(wCnt);
        System.out.println(bCnt);
    }

    private static void myExecute(int x, int y, int size) {
        int color = B[x][y];
        boolean same = checkSameColor(x, y, size);

        if (same) {
            if (color == 0) wCnt++;
            else bCnt++;
        } else {
            size = size / 2;
            myExecute(x, y, size);
            myExecute(x + size, y, size);
            myExecute(x, y + size, size);
            myExecute(x + size, y + size, size);
        }
    }

    static boolean checkSameColor(int x, int y, int size) {
        int color = B[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (B[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}
