package 실버5;

import java.util.Scanner;

public class BOJ14916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N == 1 || N == 3){
            System.out.println(-1);
            return;
        }

        int cnt5 = N / 5;
        N %= 5;
        if(N % 2 != 0) {
            cnt5--;
            N += 5;
        }
        int cnt2 = N / 2;
        System.out.println(cnt5 + cnt2);
    }
}
