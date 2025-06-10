import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(Integer number:arr){
            if(stack.empty()){
                stack.push(number);
            }else if(stack.peek() != number){
                stack.push(number);
            }
        }
        
        Integer[] temp = stack.toArray(new Integer[0]);
        int[] answer = new int[temp.length];

        for(int i=0;i<temp.length;i++){
            answer[i] = temp[i];
        }

        return answer;
    }
}