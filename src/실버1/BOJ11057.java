package 실버1;

import java.util.Scanner;

public class BOJ11057 {
    static final int MOD = 10007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int d[][] = new int[N+1][10];
        for(int i = 0; i < 10; i++){
            d[1][i] = 1;
        }

        for(int i = 2; i <= N; i++){
            d[i][0] = 1;
            for(int j = 1; j < 10; j++){
                d[i][j] = (d[i][j-1] + d[i-1][j]) % MOD;
            }
        }

        int ans = 0;
        for(int i = 0; i < 10; i++){
            ans = (ans + d[N][i]) % MOD;
        }
        System.out.println(ans);
    }
}
