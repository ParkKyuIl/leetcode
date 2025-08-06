import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Character,Integer> map = new HashMap<>();

        int playerNumbers = Integer.parseInt(br.readLine());

        for(int i=0;i<playerNumbers;i++){
            char[] playerLastName = br.readLine().toCharArray();

            map.put(playerLastName[0],map.getOrDefault(playerLastName[0],0)+1);

        }

       if(map.entrySet().stream().noneMatch(entry -> entry.getValue() >= 5)){
           System.out.println("PREDAJA");
       }else{
           map.entrySet().stream()
                   .filter(entry -> entry.getValue() >= 5)
                   .map(Map.Entry::getKey)
                   .sorted()
                   .forEach(System.out::print);
       }


    }

}