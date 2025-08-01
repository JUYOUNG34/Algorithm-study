package 실버3;

import java.io.*;
import java.util.*;

public class BOJ19941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        char[] text = br.readLine().toCharArray();
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (text[i] == 'P') {
                int start = Math.max(i - K, 0);
                int end = Math.min(i + K, N - 1);
                for (int j = start; j <= end; j++) {
                    if (text[j] == 'H') {
                        count++;
                        text[j] = 'E';
                        break;
                    }
                }
            }
        }

        System.out.println(count);
    }
}


