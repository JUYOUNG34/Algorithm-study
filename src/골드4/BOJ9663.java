package 골드4;

import java.util.Scanner;

public class BOJ9663 {

    static int[] A;
    static int N;
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = new int[N];
        backtracking(0);
        System.out.println(cnt);
    }

    private static void backtracking(int row) {
        if(row == N) {
            cnt++;
            return;
        }
        for(int i=0; i<N; i++) {
            A[row] = i;
            if(check(row)) {
                backtracking(row + 1);
            }
        }
    }

    private static boolean check(int row) {
        for(int i=0; i<row; i++) {
            if(A[i] == A[row]) return false;
            if(Math.abs(row-i) == Math.abs(A[row]-A[i])) return false;
        }
        return true;
    }
}