package 실버5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1543{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] ori = br.readLine().toCharArray();
        char[] m = br.readLine().toCharArray();
        int cnt = 0;
        int start_index = 0;
        for(int i=0; i<ori.length && start_index < ori.length;){
            start_index = i;
            boolean match = true;
            for(int j=0; j<m.length; ){
                if(ori[start_index]!=m[j]){
                    i++;
                    j=0;
                    match = false;
                    break;
                } else {
                    start_index++;
                    j++;
                }

                if(start_index >= ori.length && j<m.length){
                    match = false;
                    break;
                }
            }
            if(match){
                cnt++;
                i = start_index;
            }
        }
        System.out.println(cnt);
    }
}

