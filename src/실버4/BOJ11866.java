package 실버4;

import java.util.*;

public class BOJ11866 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            Queue<Integer> queue = new LinkedList<>();
            int n = in.nextInt();
            int m = in.nextInt();

            for (int i = 1; i <= n; i++) {
                queue.offer(i);
            }

            StringBuilder sb = new StringBuilder("<");

            while (queue.size() > 1) {
                for (int i = 1; i < m; i++) {
                    queue.offer(queue.poll());
                }
                sb.append(queue.poll()).append(", ");
            }

            sb.append(queue.poll()).append(">");
            System.out.println(sb.toString());

        } catch (Exception e) {
            System.err.println("입력 오류: " + e.getMessage());
        } finally {
            in.close();
        }
    }
}