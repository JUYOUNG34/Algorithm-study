package 실버5;

import java.util.Scanner;

public class BOJ1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int index = 666;
        while(N>count){
            String temp = String.valueOf(index);
            if(temp.contains("666")){
                count++;
            }
            index++;
        }
        System.out.println(index-1);
    }
}
