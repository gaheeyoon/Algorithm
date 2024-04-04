import java.io.IOException;

public class Main {
    public static void main(String[] arg) throws IOException {
        int n = System.in.read() - 48;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < 10; i ++) {
            sb.append(n).append(" * ").append(i)
                .append(" = ").append(n * i).append("\n");
        }
        
        System.out.println(sb);
    }
}