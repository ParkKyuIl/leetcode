import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String,String> numberAsKeyMap = new HashMap<>();
        Map<String,String> StringAsKeyMap = new HashMap<>();


        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i=1;i<=n;i++){
            String name = br.readLine();
            numberAsKeyMap.put(String.valueOf(i),name);
            StringAsKeyMap.put(name,String.valueOf(i));
        }

        for(int i=0;i<m;i++){
            String name = br.readLine();
            if(numberAsKeyMap.containsKey(name)){
                System.out.println(numberAsKeyMap.get(name));
            }else{
                System.out.println(StringAsKeyMap.get(name));
            }
        }
        
    }
}
