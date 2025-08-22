import java.io.*;
import java.util.*;



public class Main {
    static int answer = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n  = Integer.parseInt(br.readLine()); // 재료의 갯수
        int m = Integer.parseInt(br.readLine()); // 갑옷을 만들기 위해 필요한 재료의 합

        int[] materials = new int[n];
        int materialLength = materials.length;

        if(n == 1){
            answer = 0;
            
        }else{
            StringTokenizer st = new StringTokenizer(br.readLine());


            for(int i=0;i<n;i++){
                materials[i] = Integer.parseInt(st.nextToken());
            }

            for(int i=0;i<=materialLength;i++){
                for(int j=i+1;j<materialLength;j++){
                    if(materials[i]+materials[j] == m){
                        answer++;
                    }
                }
            }

        }
        System.out.println(answer);

    }
}
