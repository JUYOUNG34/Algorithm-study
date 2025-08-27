package 골드5;

import java.util.Scanner;

public class BOJ9906 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        if (n % 7 == 0 || n % 7 == 2) {
            System.out.println("CY");
        } else {
            System.out.println("SK");
        }

        scanner.close();
    }
}
