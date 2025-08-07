import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num =  Integer.parseInt(br.readLine());
        String pattern = br.readLine();

        int starIndex = pattern.indexOf('*');

        String firstPattern = pattern.substring(0,starIndex);
        String secondPattern = pattern.substring(starIndex+1);

        for(int i=0;i<num;i++){

            String word = br.readLine();

            if(word.length() < firstPattern.length()+secondPattern.length()){
                System.out.println("NE");
                continue;
            }

            if(word.startsWith(firstPattern) && word.endsWith(secondPattern)){
                System.out.println("DA");
            }else{
                System.out.println("NE");
            }
        }
    }
}