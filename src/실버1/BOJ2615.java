package 실버1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2615 {

    static int[][] board = new int[19][19];
    // 4개 방향 : ↗, →, ↘, ↓
    static int[] dx = { 1, 1, 1, 0 };
    static int[] dy = { -1, 0, 1, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int y = 0; y < 19; y++) {
            String[] line = br.readLine().split(" ");
            for (int x = 0; x < 19; x++) {
                board[y][x] = Integer.parseInt(line[x]);
            }
        }

        for (int y = 0; y < 19; y++) {
            for (int x = 0; x < 19; x++) {
                if (board[y][x] == 0) continue;

                int color = board[y][x];
                for (int dir = 0; dir < 4; dir++) {
                    if (isFive(y, x, color, dir)) {
                        System.out.println(color);
                        // 문제 요구: 행(세로) 먼저, 1-base 좌표
                        System.out.println((y + 1) + " " + (x + 1));
                        return;
                    }
                }
            }
        }

        System.out.println(0);
    }

    // 현재 (y,x)에서 주어진 방향으로 "정확히" 5개인지 판정
    private static boolean isFive(int y, int x, int color, int dir) {
        int cnt = 1;
        int nx = x;
        int ny = y;

        // 현재 칸 포함해 같은 색 5개까지 전진 확인
        for (int i = 0; i < 4; i++) {
            nx += dx[dir];
            ny += dy[dir];
            if (!inRange(nx, ny) || board[ny][nx] != color) break;
            cnt++;
        }

        if (cnt == 5) {
            // 앞쪽/뒤쪽이 같은 색이면 "6목"이므로 false
            int bx = x - dx[dir];
            int by = y - dy[dir];
            int fx = nx + dx[dir];
            int fy = ny + dy[dir];

            if ((inRange(bx, by) && board[by][bx] == color) ||
                    (inRange(fx, fy) && board[fy][fx] == color)) {
                return false;
            }
            return true;
        }

        return false;
    }

    private static boolean inRange(int x, int y) {
        return 0 <= x && x < 19 && 0 <= y && y < 19;
    }
}

