package 실버2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ11722 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> B = new ArrayList<>();
        B.add(A[0]);
        for(int i=1; i<N; i++){ //A배열을 탐색하기
            int now = A[i];
            boolean isAdd = false;
            for(int j=0; j<B.size(); j++){
                int temp = B.get(j);
                if(temp <= now){
                    B.set(j, now);
                    isAdd = true;
                    break;
                }
            }
            if(!isAdd) B.add(now);
        }
        System.out.println(B.size());
    }

}
