import java.io.*;
import java.util.*;

public class Main {
    static int sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        char[] letters = word.toCharArray();



        int start = 0;
        int end = letters.length-1;
        int answer = 1;

        while(start <= end){
            if(letters[start] != letters[end]){
                answer = 0;
                break;
            }

            start++;
            end--;

        }


        System.out.println(answer);



    }

}