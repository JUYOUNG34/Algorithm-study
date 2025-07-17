package 실버3;

import java.util.Scanner;

public class BOJ9461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] P = new long[101];

        P[1] = 1;
        P[2] = 1;
        P[3] = 1;
        P[4] = 2;
        P[5] = 2;
        P[6] = 3;

        for (int i = 7; i <= 100; i++) {
            P[i] = P[i - 1] + P[i - 5];
        }

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            System.out.println(P[N]);
        }

        sc.close();
    }
}
