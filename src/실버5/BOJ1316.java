package 실버5;

import java.io.*;

public class BOJ1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=0; i<N; i++){
            int[] check = new int[26]; // a부터 z까지 체크 배열
            char[] text = br.readLine().toCharArray();

            // 첫번째 문자
            char before = text[0];
            check[(int)(before-'a')] = 1;
            boolean group = true;

            for(int j=1; j<text.length; j++){
                char now = text[j];

                // 연속된 문자가 아닌데 이전에 등장한 경우 (그룹 단어가 아님)
                if(before!=now && check[(int)(now-'a')]==1){
                    group = false;
                    break;
                }

                check[(int)(now-'a')]=1;
                before = now;
            }

            if(group) count++;
        }

        System.out.println(count);
    }
}