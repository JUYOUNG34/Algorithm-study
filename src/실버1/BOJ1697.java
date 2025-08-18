package 실버1;

import java.util.*;

public class BOJ1697 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] visit = new int[100001]; // i 위치에 몇 초 만에 방문했나요?
        visit[N] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);

        // BFS 탐색
        while (!queue.isEmpty()) {
            int now = queue.poll();

            if (now == K) { // 지금 위치가 동생의 위치이면
                System.out.println(visit[now]);
                break;
            }

            int[] nextList = {now - 1, now + 1, now * 2};

            for (int next : nextList) {
                if (0 <= next && next <= 100000 && visit[next] == 0) {
                    visit[next] = visit[now] + 1;
                    queue.add(next);
                }
            }
        }
    }
}