import java.io.IOException;

public class Main {
    public static void main(String[] arg) throws IOException {
            int a = System.in.read() - 48;
            System.in.read();
        
            int b = System.in.read() - 48;

            System.out.println(a + b);
    }
}
