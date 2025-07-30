import java.io.*;
import java.util.*;

public class Main {
    static int sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] parking = new int[100];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        for(int i=0;i<3;i++){
            StringTokenizer parkingTime = new StringTokenizer(br.readLine());

            int arrivalTime = Integer.parseInt(parkingTime.nextToken());
            int departTime = Integer.parseInt(parkingTime.nextToken());

            for(int j=arrivalTime-1;j<departTime-1;j++){
                parking[j]++;
            }
        }

        for(int num:parking){
            if(num != 0){
                if(num == 1){
                    sum+=a;
                } else if (num == 2) {
                    sum+=b *2;
                }
                else if(num ==3){
                    sum+=c * 3;
                }
            }
        }
        System.out.println(sum);
    }

}