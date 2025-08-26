import java.io.*;
import java.util.*;

public class Main {
  
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int j=0;j<n;j++){
            char[] word = br.readLine().toCharArray();

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < word.length; i++) {
                if(stack.isEmpty()){
                    stack.push(word[word.length-1-i]);
                }else{
                    if(stack.peek() == word[word.length-1-i]){
                        stack.pop();
                    }else{
                        stack.push(word[word.length-1-i]);
                    }
                }
            }
            if(stack.isEmpty()){
                answer++;
            }
        }
System.out.println(answer);
    }
}
