import java.io.*;
import java.util.*;

public class Main {
    static long c;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer n = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(n.nextToken());
        long b = Integer.parseInt(n.nextToken());
        c = Integer.parseInt(n.nextToken());


        System.out.println(go(a,b));
    }

    static private long go(long a,long b){
        if(b == 1) return a % c;

        long ret = go(a,b/2);
        ret = ret * ret % c;
        if(b % 2 == 1){
            ret = ret * a % c;
        }
        return ret;
    }
}
