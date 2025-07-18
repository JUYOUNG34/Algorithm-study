package 실버5;

import java.util.Scanner;

public class BOJ1789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();
        long sum = 0;
        long N = 1;
        while (sum < S) {
            sum += N;
            N++;
        }

        System.out.println(N-2);
    }
}
