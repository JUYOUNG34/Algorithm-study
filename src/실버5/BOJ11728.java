package 실버5;

import java.util.StringTokenizer;
import java.io.*;

public class BOJ11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int A[] = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        int B[] = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            B[i] = Integer.parseInt(st.nextToken());
        }

        int pointer_A = 0;
        int pointer_B = 0;

        // A와 B 배열 비교 병합
        while(pointer_A < N && pointer_B < M){
            if(A[pointer_A] > B[pointer_B]){
                wr.write(B[pointer_B] + " ");
                pointer_B++;
            } else {
                wr.write(A[pointer_A] + " ");
                pointer_A++;
            }
        }

        // A 배열이 먼저 끝났을 경우, B 배열 남은 부분 출력
        if(pointer_A == N){
            for(int i = pointer_B; i < M; i++){
                wr.write(B[i] + " ");
            }
        }

        // B 배열이 먼저 끝났을 경우, A 배열 남은 부분 출력
        if(pointer_B == M){
            for(int i = pointer_A; i < N; i++){
                wr.write(A[i] + " ");
            }
        }

        wr.flush();
        wr.close();
    }
}
