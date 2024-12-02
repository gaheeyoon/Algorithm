import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        
        for(int i=1; i<10; i++) {
            int num = Integer.parseInt(br.readLine());
            
            if(num > max) {
                max = num;
                maxIndex = i;
            }
        }
        
        System.out.println(max);
        System.out.println(maxIndex);
        
        br.close();
    }
}