import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] cnt = new int[26];
        StringBuilder ret = new StringBuilder();

        for(int i=0;i<num;i++){
            cnt[br.readLine().toCharArray()[0] - 'a']++;
        }

        for(int i=0;i<26;i++){
            if(cnt[i] >= 5){
                int asciiNum = i + 'a';
                ret.append((char) asciiNum);
            }
        }
        if(ret.length()==0){
            System.out.println("PREDAJA");
        }else{
            System.out.println(ret);
        }
    }

}