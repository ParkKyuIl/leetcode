import java.io.*;
import java.util.*;

public class Main {

    static int[] heights = new int[9];
    static boolean[] visited = new boolean[9];
    static int[] selected = new int[7];
    static boolean found = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            heights[i] = Integer.parseInt(br.readLine());
        }

        permute(0,0);


    }

    static void permute(int depth, int start){

        if(found) return;
        int sum = 0;
        if(depth == 7) {
            for (int i = 0; i < 7; i++) {
                sum += selected[i];
            }
            if (sum == 100) {
                Arrays.sort(selected);
                for (int h : selected) {
                    System.out.println(h);
                }
                found = true;
            }
            return;
        }



        for (int i = start; i < 9; i++) {
            if(!visited[i]){
                visited[i] = true;
                selected[depth] = heights[i];
                permute(depth+1,i+1);
                visited[i] = false;
            }

        }

        }
}
