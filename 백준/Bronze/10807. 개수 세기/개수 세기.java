import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int v = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++) {
            if(Integer.parseInt(st.nextToken()) == v) {
                count++;
            }
        }
        
        System.out.println(count);
        br.close();
    }
}