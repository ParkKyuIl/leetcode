import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] heights = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            heights[i] = Integer.parseInt(br.readLine());
            sum += heights[i];
        }

        int fakeSum = sum - 100;
        int fake1 = 0;
        int fake2 = 0;

        for(int i=0;i<9;i++){
            for(int j=i+1;j<9;j++){
                if(heights[j]+heights[i] == fakeSum){
                    fake1 = heights[i];
                    fake2 = heights[j];
                }
            }
        }

        List<Integer> result = new ArrayList<>();

        for(int i=0;i<9;i++){
            if(heights[i] == fake1 || heights[i] ==  fake2){
                continue;
            }
            result.add(heights[i]);
        }

        Collections.sort(result);

        StringBuilder sb = new StringBuilder();

        for(int h: result) sb.append(h).append("\n");

        System.out.println(sb);


    }
}
