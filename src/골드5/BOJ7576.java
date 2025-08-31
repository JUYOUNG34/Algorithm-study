package 골드5;

import java.util.*;
import java.io.*;

public class BOJ7576 {
    static int m, n;
    static int[][] matrix;
    static Queue<int[]> queue = new LinkedList<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int res = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        matrix = new int[n][m];

        // 입력 받기 및 초기 익은 토마토(1) 위치를 큐에 추가
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
                if (matrix[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        // BFS 실행
        bfs();

        // 결과 확인
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                res = Math.max(res, matrix[i][j]);
            }
        }

        System.out.println(res - 1);
    }

    static void bfs() {
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + x;
                int ny = dy[i] + y;

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && matrix[nx][ny] == 0) {
                    matrix[nx][ny] = matrix[x][y] + 1;
                    queue.offer(new int[]{nx, ny});
                }
            }
        }
    }
}
