import java.io.*;
import java.util.*;


//첫째 줄에 알파벳 대문자, 소문자, 공백, 숫자로만 이루어진 문자열 S가 주어진다. S의 길이는 100을 넘지 않는다.
//
//        출력
//첫째 줄에 S를 ROT13으로 암호화한 내용을 출력한다.
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] password =  br.readLine().toCharArray();

        for(int i=0;i<password.length;i++){
            int asciCode = password[i];
            if((asciCode >= 97 && asciCode <= 122)){
               asciCode += 13;
               if(asciCode > 122){
                   asciCode = asciCode % 122 + 96;
               }
               password[i] = (char) asciCode;
            } else if (asciCode >= 65 && asciCode <= 90) {
                asciCode += 13;
                if(asciCode > 90){
                    asciCode = asciCode % 90 + 64;
                }
            }
            password[i] = (char) asciCode;

        }
        System.out.println(password);
    }

}