import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int basketNum = Integer.parseInt(st.nextToken());
        int ballPushCount = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[basketNum];
        
        for(int i=0; i<ballPushCount; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            
            int startBasketNum = Integer.parseInt(st.nextToken()) - 1;
            int endBasketNum = Integer.parseInt(st.nextToken()) - 1;
            int ballNum = Integer.parseInt(st.nextToken());
            
            for(int j=startBasketNum; j<=endBasketNum; j++) {
                arr[j] = ballNum;   
            }
        }
        
        for(int i=0; i<basketNum; i++) {
            sb.append(arr[i]).append(" ");
        }
        
        System.out.println(sb);
        
        br.close();
    }
}