package 실버5;

import java.io.*;
import java.util.*;

public class BOJ7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> members = new HashSet<>();

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String action = st.nextToken();

            if(action.equals("enter")){
                members.add(name);
            }else{
                members.remove(name);
            }
        }

        ArrayList<String> answer = new ArrayList<>(members);
        answer.sort(Collections.reverseOrder());

        for(String name : answer){
            System.out.println(name);
        }
    }
}