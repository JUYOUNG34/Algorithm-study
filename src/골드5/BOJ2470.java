package 골드5;

import java.io.*;
import java.util.*;

public class BOJ2470 {
    static int n;
    static int[] a = new int[100000];
    static int[] s = new int[2];

    static void sol() {
        int l = 0, r = n - 1, mn = 2000000000;
        while (l < r) {
            int sum = a[l] + a[r];
            int tmp = Math.abs(sum);
            if (mn > tmp) {
                s[0] = l;
                s[1] = r;
                mn = tmp;
            }
            if (sum == 0) return;
            if (sum > 0) {
                r--;
            } else {
                l++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a, 0, n);
        sol();

        bw.write(a[s[0]] + " " + a[s[1]]);
        bw.flush();
        bw.close();
        br.close();
    }
}