package 실버4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A[] = new int[N];

        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(A);
        int M = (int)Math.round(N*0.15);

        int sum = 0;
        for(int i=M; i<N-M; i++){
            sum += A[i];
        }

        float E = sum/(float)(N-2*M);
        System.out.println(Math.round(E));
    }
}
