import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int multiplicand = Integer.parseInt(br.readLine());
        String multiplier = br.readLine();

        sb.append(multiplicand * (multiplier.charAt(2) - '0')).append("\n");
        sb.append(multiplicand * (multiplier.charAt(1) - '0')).append("\n");
        sb.append(multiplicand * (multiplier.charAt(0) - '0')).append("\n");
        sb.append(multiplicand * Integer.parseInt(multiplier)).append("\n");
        
        System.out.println(sb);
        
        br.close();
    }
}