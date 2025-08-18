package 실버2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int max = -1;
        int min = 256;
        int myMap[][] = new int[N][M];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                myMap[i][j] = Integer.parseInt(st.nextToken());
                if(max < myMap[i][j]) max = myMap[i][j];
                if(min > myMap[i][j]) min = myMap[i][j];
            }
        }

        // 모든 가능한 높이에 대해 최소 시간을 구하는 과정
        // 1. 블록 제거는 2초가 걸리지만 인벤토리에 블록이 추가됨
        // 2. 블록 놓기는 1초가 걸리고 인벤토리에서 블록이 사라짐
        int result = Integer.MAX_VALUE;
        int result_h = -1;

        for(int h=min; h<=max; h++) {
            int time = 0;
            int tempB = B;

            for(int i=0; i<N; i++) {
                for(int j=0; j<M; j++) {
                    int now = myMap[i][j];

                    if(now > h) {
                        int diff = now - h;
                        time += diff*2;
                        tempB += diff;
                    } else if(now < h) {
                        int diff = h - now;
                        time += diff;
                        tempB -= diff;
                    }
                }
            }

            if(result >= time && tempB >= 0) {
                result = time;
                result_h = h;
            }
        }

        System.out.println(result + " " + result_h);
    }
}