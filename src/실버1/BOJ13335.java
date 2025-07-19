package 실버1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ13335{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int w = sc.nextInt();
        int L = sc.nextInt();

        int[] trucks = new int[n];
        for (int i = 0; i < n; i++) {
            trucks[i] = sc.nextInt();
        }

        Queue<Integer> bridge = new LinkedList<>();
        for (int i = 0; i < w; i++) {
            bridge.offer(0);
        }

        int sum = 0;
        int index = 0;
        int time = 0;

        while (index < n) {
            time++;
            sum -= bridge.poll();

            if (sum + trucks[index] <= L) {
                sum += trucks[index];
                bridge.offer(trucks[index]);
                index++;
            } else {
                bridge.offer(0);
            }
        }

        time += w; // 마지막 트럭이 다리 건너는 시간까지 추가
        System.out.println(time);
    }
}

