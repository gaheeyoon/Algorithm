import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalAmount = Integer.parseInt(br.readLine());
        int totalCount = Integer.parseInt(br.readLine());
        int sum = 0;
        
        StringTokenizer st;
        
        for(int i=0; i<totalCount; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int amount = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken()); 
            
            sum += amount * count;
        }
        
        if(sum == totalAmount) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        br.close();
    }
}