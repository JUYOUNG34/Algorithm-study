package 실버1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Short {
    int s;
    int e;
    int v;

    public Short(int s, int e, int v) {
        this.s = s;
        this.e = e;
        this.v = v;
    }
}

public class BOJ1446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int D[] = new int[k + 1];
        List<Short> shortList = new ArrayList<>();

        // 입력 받기
        for (int i = 0; i < N; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            int v = sc.nextInt();
            Short now = new Short(s, e, v);
            shortList.add(now);
        }

        // 초기화
        for (int i = 0; i <= k; i++) {
            D[i] = i; // 지름길을 하나도 안 쓰는 경우 = 직진만 하는 경우의 최소값
        }

        // DP 갱신
        for (int i = 0; i <= k; i++) {
            if (i > 0) {
                D[i] = Math.min(D[i], D[i - 1] + 1);
            }
            for (int j = 0; j < shortList.size(); j++) {
                Short now = shortList.get(j);
                if (i == now.s && now.e <= k) {
                    D[now.e] = Math.min(D[now.e], D[now.s] + now.v);
                }
            }
        }

        System.out.println(D[k]);
    }
}
