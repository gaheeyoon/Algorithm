import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int multiplicand = Integer.parseInt(br.readLine());
        String multiplier = br.readLine();

        System.out.println(multiplicand * (multiplier.charAt(2) - '0'));
        System.out.println(multiplicand * (multiplier.charAt(1) - '0'));
        System.out.println(multiplicand * (multiplier.charAt(0) - '0'));
        System.out.println(multiplicand * Integer.parseInt(multiplier));
        
        br.close();
    }
}