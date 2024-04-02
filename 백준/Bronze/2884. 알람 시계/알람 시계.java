import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        min -= 45;
        
        if (min < 0) {
            min += 60;
            hour -= 1;
        }
        
        if (hour < 0) {
            hour = 23;
        }
        
        StringBuffer sb = new StringBuffer();
        sb.append(hour).append(" ").append(min);
        System.out.println(sb);
        
        br.close();
    }
}