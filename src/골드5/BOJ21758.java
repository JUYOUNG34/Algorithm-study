package 골드5;

import java.util.Scanner;

public class BOJ21758 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] honey = new int[N + 1];
        int[] sum = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            honey[i] = sc.nextInt();
            sum[i] = sum[i - 1] + honey[i];
        }

        int result = 0;

        for (int i = 2; i < N; i++) {
            // 벌 - 벌 - 꿀통
            int value1 = (sum[N] - sum[1] - honey[i]) + (sum[N] - sum[i]);

            // 꿀통 - 벌 - 벌
            int value2 = (sum[N - 1] - honey[i]) + sum[i - 1];

            // 벌 - 꿀통 - 벌
            int value3 = (sum[i] - honey[1]) + (sum[N - 1] - sum[i - 1]);

            result = Math.max(result, Math.max(Math.max(value1, value2), value3));
        }

        System.out.println(result);

        sc.close();
    }
}
