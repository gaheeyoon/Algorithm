import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int buddhaYear = Integer.parseInt(br.readLine());
        int year = buddhaYear - 543;
            
        System.out.println(year);
        
        br.close();
    }
}