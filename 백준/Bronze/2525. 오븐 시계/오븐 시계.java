import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int cookTime = Integer.parseInt(br.readLine());
        
        hour = (hour + (min + cookTime) / 60) % 24;
        min = (min + cookTime) % 60;
        
        StringBuffer sb = new StringBuffer();
        sb.append(hour).append(" ").append(min);
        System.out.println(sb);
        
        br.close();
    }
}