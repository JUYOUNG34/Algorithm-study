package 실버5;

import java.io.*;
import java.util.*;

public class BOJ1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        Set<String> set = new TreeSet<>((a, b) -> {
            if (a.length() != b.length()) return a.length() - b.length();
            return a.compareTo(b);
        });

        for (int i = 0; i < n; i++) {
            set.add(bf.readLine());
        }

        for (String s : set) {
            System.out.println(s);
        }
    }
}
