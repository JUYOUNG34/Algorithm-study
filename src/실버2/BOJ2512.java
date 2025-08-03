package 실버2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2512 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = 0;
        int max = -1;
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            if (max < A[i]) max = A[i];
        }

        int total = Integer.parseInt(br.readLine());
        while (min <= max) {
            int tempTotal = 0;
            int mid = (min + max) / 2;
            for (int i = 0; i < N; i++) {
                int now = A[i];
                if (now <= mid) {
                    tempTotal += now;
                } else {
                    tempTotal += mid;
                }
            }
            if (total >= tempTotal) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        System.out.println(max);

    }
}
