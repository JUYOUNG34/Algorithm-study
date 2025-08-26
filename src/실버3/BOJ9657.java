package 실버3;

import java.util.Scanner;

public class BOJ9657 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D[] = new int[N+4];
        D[1] = 1;
        D[2] = 0;
        D[3] = 1;
        D[4] = 1;
        for(int i = 5; i<=N; i++){
            if(D[i-1]+D[i-3]+D[i-4]==3){
                D[i] = 0;
            }else{
                D[i] = 1;
            }
        }
        if(D[N]==1) System.out.println("SK");
        else System.out.println("CY");
    }
}