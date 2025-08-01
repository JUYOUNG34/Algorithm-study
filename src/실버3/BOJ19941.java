package 실버3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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
                for (int j = i - K; j <= i + K; j++) {
                    if (j < 0 || j >= N) continue;
                    if (text[j] == 'H') {
                        count++;
                        text[j] = 'E';
                        break;
                    }
                }
            }
        }
    }
}

