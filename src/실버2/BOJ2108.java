package 실버2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int C[] = new int[8001];
        int A[] = new int[N];

        int sum = 0;
        for(int i=0; i<N; i++){
            int temp = Integer.parseInt(br.readLine());
            sum += temp;
            A[i] = temp;
            C[temp + 4000]++;
        }

        double average = sum / (double) N;
        System.out.println(Math.round(average));

        Arrays.sort(A);
        System.out.println(A[N/2]);

        int countMax = 0;
        for(int i = 0; i <= 8000; i++){
            if(C[i] > countMax) {
                countMax = C[i];
            }
        }

        int countV = 0;
        boolean first = true;
        for(int i = 0; i <= 8000; i++){
            if(C[i] == countMax) {
                if(first) {
                    countV = i;
                    first = false;
                } else {
                    countV = i;
                    break;
                }
            }
        }
        System.out.println(countV - 4000);
        System.out.println(A[N-1] - A[0]);
    }
}