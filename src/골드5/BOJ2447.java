package 골드5;

import java.util.*;
import java.io.*;

public class BOJ2447 {
    public static List<String> drawStars(int n) {
        if (n == 1) {
            List<String> result = new ArrayList<>();
            result.add("*");
            return result;
        }

        List<String> stars = drawStars(n / 3);
        List<String> L = new ArrayList<>();

        for (String star : stars) {
            L.add(star + star + star);
        }

        for (String star : stars) {
            String spaces = " ".repeat(n / 3);
            L.add(star + spaces + star);
        }

        for (String star : stars) {
            L.add(star + star + star);
        }

        return L;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<String> result = drawStars(N);

        for (String line : result) {
            System.out.println(line);
        }

        br.close();
    }
}