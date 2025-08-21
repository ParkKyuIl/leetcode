import java.io.*;
import java.util.*;



public class Main {
    static int[] cnt = new int[26];
    static int flag = 0;
    static Deque<Character> answer = new LinkedList<>();

    public static void main(String[] args) throws IOException {


        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] word = br.readLine().toCharArray();

        for(char letter:word){
            cnt[letter-65] += 1;
        }
        int mid = -1;


        for(int i = 'Z'-65;i>='A'-65;i--){
            if(cnt[i] % 2 != 0){
                flag++;
                if(flag == 2){
                    break;
                }
                mid = i;
                cnt[i] --;
            }

            for(int j = 0;j < cnt[i];j += 2){
                char letter = (char) (i + 65);
                answer.addFirst(letter);
                answer.addLast(letter);
            }


        }


        if(flag >= 2){
            System.out.println("I'm Sorry Hansoo");
        }else{
            for(char c:answer) sb.append(c);

            if(mid != -1){
                sb.insert(sb.length()/2,(char) (mid +65));
            }


            System.out.println(sb);
        }

    }
}
