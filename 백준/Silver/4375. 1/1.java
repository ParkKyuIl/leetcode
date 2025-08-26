import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);

            int rem = 1 % n;
            int len = 1;

            while (rem != 0) {
                rem = (rem * 10 + 1) % n;
                len++;
            }
            System.out.println(len);
        }
    }
}
