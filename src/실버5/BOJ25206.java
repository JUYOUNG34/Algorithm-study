package 실버5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double total_score = 0.0;
        double sum = 0.0;

        for(int i=0; i<20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String title = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if(grade.equals("P"))
                continue;
            total_score += score;
            double m = 0.0;
            switch (grade) {
                case "A+" : m = 4.5; break;
                case "A0" : m = 4.0; break;
                case "B+" : m = 3.5; break;
                case "B0" : m = 3.0; break;
                case "C+" : m = 2.5; break;
                case "C0" : m = 2.0; break;
                case "D+" : m = 1.5; break;
                case "D0" : m = 1.0; break;
                case "F"  : m = 0.0; break;
            }
            sum += score * m;
        }

        System.out.println(sum / total_score);
    }
}