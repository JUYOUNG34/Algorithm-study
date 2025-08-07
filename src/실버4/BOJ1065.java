package 실버4;

import java.util.Scanner;

public class BOJ1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int count = Integer.parseInt(n);
        if (count > 99) {
            count = 99;
        } else {
            System.out.println(count);
            return;
        }

        for (int i = 100; i <= Integer.parseInt(n); i++) {
            char[] c = String.valueOf(i).toCharArray();
            boolean hansu = true;
            int check = c[0] - c[1];
            for (int j = 1; j < c.length - 1; j++) {
                if (c[j] - c[j + 1] != check) {
                    hansu = false;
                    break;
                }
            }
            if (hansu) count++;
        }
        System.out.println(count);
    }
}