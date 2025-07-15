package 실버3;

import java.io.*;
import java.util.*;

public class BOJ2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A[] = new int[N*N];

        StringTokenizer st;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                A[i*N+j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(A);
        System.out.println(A[N*N-N]);
    }
}