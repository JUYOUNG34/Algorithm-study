package 실버2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        long A[] = new long[N];
        st = new StringTokenizer(br.readLine());
        long high = 0;
        long low = 0;
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(st.nextToken());
            high = Math.max(high, A[i]);
        }
        long answer = 0;
        while (high >= low) {
            long mid = (high + low) / 2;
            long sum = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] > mid) {
                    sum += (A[i] - mid);
                }
            }
            if (sum >= M) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(answer);
    }
}
