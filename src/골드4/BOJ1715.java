package 골드4;

import java.util.*;
import java.io.*;

public class BOJ1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int data = Integer.parseInt(br.readLine());
            pq.add(data);
        }

        int sum = 0;
        int card1, card2;

        while (pq.size() != 1) {
            card1 = pq.poll();
            card2 = pq.poll();
            pq.add(card1 + card2);
            sum += card1 + card2;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}
