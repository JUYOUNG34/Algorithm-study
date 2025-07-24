package 실버5;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] cards = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);
        int M =  Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            int row = Integer.parseInt( st.nextToken());
            sb.append(binarySearch(cards, N , row) + " ");
        }
        bw.write(sb.toString()+"\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static int binarySearch(int[] cards, int N, int search){
        int first = 0;
        int last = N-1;
        int mid = 0;

        while(first <= last){
            mid = (first + last)/2;

            if(cards[mid] == search){
                return 1;
            }

            else if(cards[mid] < search){
                first = mid+1;
            } else {
                last = mid-1;
            }
        }
        return 0;
    }
}