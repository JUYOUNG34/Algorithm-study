package 실버5;

import java.io.*;
import java.util.*;

public class BOJ2751 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for (int i=0; i<list.size(); i++) {
            sb.append(list.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}