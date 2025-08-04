package 실버2;

import java.util.Scanner;

public class BOJ2477 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D[][] = new int[6][2];
        int k = sc.nextInt();

        for(int i=0; i<6; i++){
            D[i][0] = sc.nextInt();
            D[i][1] = sc.nextInt();
        }

        int maxH = 0;
        int maxW = 0;
        int maxH_index = -1;
        int maxW_index = -1;

        for(int i=0; i<6; i++){
            int now = D[i][1];
            if(D[i][0] == 1 || D[i][0] == 2){
                if(now > maxW){
                    maxW = now;
                    maxW_index = i;
                }

        }else{
            if(now > maxH){
                maxH = now;
                maxH_index = i;
            }
        }
    }
        int S = maxW * maxH;
        int minW = D[(maxH_index + 3) % 6][1];
        int minH = D[(maxW_index + 3) % 6][1];
        S -= minW * minH;
        System.out.println(S*k);

    }
}
