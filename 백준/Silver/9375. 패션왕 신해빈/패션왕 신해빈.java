import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCaseNum = Integer.parseInt(br.readLine());
        Map<String,Integer> map = new HashMap<>();


        for(int i=0;i<testCaseNum;i++){
            int clothNum = Integer.parseInt(br.readLine());
            map.clear();
            for(int j=0;j<clothNum;j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String clothName = st.nextToken();
                map.put(clothName,map.getOrDefault(clothName,0)+1);
            }

            for(Map.Entry<String, Integer> val: map.entrySet()){
                map.put(val.getKey(),val.getValue()+1);
            }

            int product = 1;

            for(int val: map.values()){
                product *= val;
            }
            System.out.println(product-1);
        }



    }
}
