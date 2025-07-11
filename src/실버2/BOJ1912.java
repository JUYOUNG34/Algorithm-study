package 실버2;

import java.io.*;
import java.util.*;

public class BOJ1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A[] = new int[N];
        int D[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        D[0] = A[0];
        for(int i=1; i<N; i++){
            if(D[i-1]<0)D[i] = A[i];
            else D[i] = D[i-1] + A[i];
        }

        int max = -1001;
        for(int i=0; i<N; i++){
            if(max < D[i]) max = D[i];
        }

        System.out.println(max);
    }
}