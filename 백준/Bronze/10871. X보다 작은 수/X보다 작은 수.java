import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine(), " ");
        
        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num < x) {
                sb.append(num).append(" ");
            }
        }
        
        System.out.println(sb);
        
        br.close();
    }
}