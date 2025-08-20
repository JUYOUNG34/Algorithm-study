package 실버2;

import java.util.Scanner;

public class BOJ11053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int[] dp = new int[N + 1];

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j]) {
                    if (dp[i] <= dp[j]) {
                        dp[i] = dp[j] + 1;
                    }
                }
            }
        }

        // dp 배열에서 최댓값 찾기
        int maxValue = 0;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] > maxValue) {
                maxValue = dp[i];
            }
        }

        System.out.println(maxValue + 1);
        scanner.close();
    }
}