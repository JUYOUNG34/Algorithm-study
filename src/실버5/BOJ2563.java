package 실버5;

import java.util.Scanner;

public class BOJ2563 {
    static int N;
    static int M;
    static boolean V[];
    static int S[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        V = new boolean[N];
        S = new int[M];
        backtracking(0);
    }

    private static void backtracking(int length) {
        if(length == M){
            for(int i=0; i<M; i++){
                System.out.print(S[i]+1+" ");
            }
            System.out.println();
            return;
        }

        for(int i=0; i<N; i++){
            if(!V[i]){
                S[length] = i;
                V[i] = true;
                backtracking(length+1);
                V[i] = false;
            }
        }
    }
}