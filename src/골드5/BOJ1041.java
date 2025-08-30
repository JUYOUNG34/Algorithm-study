package 골드5;

import java.util.Scanner;

public class BOJ1041 {
    static int n;
    static int[] dice = new int[6];
    static int min3 = 151, min2 = 101, min1 = 51, max1 = 0;
    static long answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for (int i = 0; i < 6; i++) {
            dice[i] = sc.nextInt();
            answer += dice[i];
            max1 = Math.max(max1, dice[i]);
        }

        if (n == 1) {
            System.out.print(answer - max1);
            return;
        }

        for (int i = 0; i < 6; i++) {
            min1 = Math.min(min1, dice[i]);
            for (int j = i + 1; j < 6; j++) {
                if (i + j == 5) {
                    continue;
                }
                min2 = Math.min(min2, dice[i] + dice[j]);
                for (int k = j + 1; k < 6; k++) {
                    if (j + k == 5 || k + i == 5) {
                        continue;
                    }
                    min3 = Math.min(min3, dice[i] + dice[j] + dice[k]);
                }
            }
        }

        answer = 0;
        answer += (5 * (long)n * n - 16 * n + 12) * min1;
        answer += 4 * min3;
        answer += (8 * n - 12) * min2;

        System.out.print(answer);
        sc.close();
    }
}
