package 실버5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] temp = br.readLine().toCharArray();
        int[] count = new int[10];

        for(int i = 0; i < temp.length; i++) {
            int index = Integer.parseInt(String.valueOf(temp[i]));
            count[index]++;
        }

        int max = -1;
        for(int i = 0; i < 10; i++) {
            if(i == 6 || i == 9) continue;
            if(max < count[i]) {
                max = count[i];
            }
        }

        int f = (count[6] + count[9]) / 2;
        if((count[6] + count[9]) % 2 != 0) f++;
        if(max < f)
            max = f;

        System.out.println(max);
    }
}
