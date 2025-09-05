package 실버1;

import java.util.Scanner;

public class BOJ2156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N+1];
        for(int i=1; i<N+1; i++){
            A[i] = sc.nextInt();
        }
        if(N==1) {
            System.out.println(A[1]);
        }else if(N==2){
            System.out.println(A[1] + A[2]);
        }else{
            int D[] = new int[N+1];
            D[1] = A[1];
            D[2] = A[1] + A[2];
            for(int i=3; i<=N; i++){
                D[i] = Math.max(D[i-1], Math.max(D[i-2]+A[i], D[i-3]+A[i-1]+A[i]));
            }
            System.out.println(D[N]);
        }
    }
}
