import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line =  br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] temperatures = new int[n];
        int[] results = new int[n-k+1];


        line =  br.readLine();
        st = new StringTokenizer(line);

        for(int i=0;i<n;i++){
            temperatures[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<n-k+1;i++){

            for(int j=0;j<k;j++){
                results[i] += temperatures[j+i];
            }
        }

        System.out.println(Arrays.stream(results).max().getAsInt());



    }
}