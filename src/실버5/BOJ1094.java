package 실버5;

import java.util.Scanner;

public class BOJ1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int X = sc.nextInt();
        while(X>0){
            if(X%2 ==1 ){
                answer++;
            }
            X=X/2;
        }
        System.out.println(answer);
    }
}
