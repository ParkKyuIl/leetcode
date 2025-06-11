import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for(int i=0;i<scoville.length;i++){
            queue.offer(scoville[i]);
        }
        

        int count = 0;
        
        while(queue.size()>=2 && queue.peek() < K){
            int first = queue.poll();
            int second = queue.poll();
            
            int mixScoville = first + (second *2);
            
            queue.offer(mixScoville);
            
            count++;
        }
        
        if (queue.peek() < K) return -1;

        
        return count;
    }
}