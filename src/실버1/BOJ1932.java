package 실버1;

import java.util.Scanner;

public class BOJ1932 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D[][] = new int[N][N];
        D[0][0] = sc.nextInt();
        for(int i=1; i<N; i++){
            for(int j=0; j<=i; j++){
                int now = sc.nextInt();
                if(j==0) D[i][j] = D[i-1][j] + now;
                else if(j==i) D[i][j] = D[i-1][j-1] + now;
                else {
                    D[i][j] = Math.max(D[i-1][j], D[i-1][j-1]) + now;
                }
            }
        }
        int max = -1;
        for(int i=0; i<N; i++){
            if(max < D[N-1][i]){
                max = D[N-1][i];
            }
        }
        System.out.println(max);
    }
}
