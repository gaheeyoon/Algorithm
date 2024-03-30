import java.io.IOException;

public class Main {
    public static void main(String[] arg) throws IOException {
            double a = System.in.read() - 48;
            System.in.read();
            double b = System.in.read() - 48;
            
            System.out.println(a / b);
    }
}