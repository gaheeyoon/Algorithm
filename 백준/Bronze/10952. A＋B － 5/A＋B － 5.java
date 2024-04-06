import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String line;
		
		while(true) {
		    line = br.readLine();
            int a = (line.charAt(0) - 48);
            int b = (line.charAt(2) - 48);
            
            if(a == 0 && b == 0) {
                break;
            }
            
            sb.append(a + b).append("\n");
		}
		
        System.out.println(sb);
        br.close();
	}
}