package 골드5;

import java.util.Scanner;

public class BOJ12865 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[][] items = new int[N + 1][2];
        items[0][0] = 0;
        items[0][1] = 0;

        int[][] dp = new int[N + 1][K + 1];

        for (int i = 1; i <= N; i++) {
            items[i][0] = sc.nextInt();
            items[i][1] = sc.nextInt();
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                int w = items[i][0];
                int v = items[i][1];

                if (j < w) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w] + v);
                }
            }
        }

        System.out.println(dp[N][K]);

        sc.close();
    }
}
