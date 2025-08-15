package 실버2;

import java.util.Scanner;

public class BOJ1138 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        int B[] = new int[N];

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            int empty = 0;
            int now = A[i];
            for(int j=0; j<N; j++){
                if(B[j] == 0) empty++;
                if(now == empty-1){
                    B[j] = i + 1;
                    break;
                }
            }
        }

        for(int i=0; i<N; i++){
            System.out.print(B[i]+" ");
        }
    }
}