package 실버2;

import java.util.Scanner;

public class BOJ2304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[1001];
        int maxH = 0;
        int maxIndex = 0;
        for(int i=0; i<N; i++){
            int index = sc.nextInt();
            int h = sc.nextInt();
            A[index] = h;
            if(h > maxH){
                maxH = h;
                maxIndex = index;
            }
        }

        int sum = 0;
        int nowH = 0;
        for(int i=0; i<=maxIndex; i++){
            if(nowH < A[i]){
                nowH = A[i];
            }
            sum += nowH;
        }

        nowH = 0;
        for(int i=1000; i>maxIndex; i--){
            if(nowH < A[i]){
                nowH = A[i];
            }
            sum += nowH;
        }
        System.out.println(sum);
    }
}