import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answe = 0;
        
        
        while(wallet[0] < bill[0] || wallet[1] < bill[1]){
            
            if(bill[0] > bill[1]){
                bill[0] = bill[0]/2;
            }else{
                bill[1] = bill[1]/2;
            }
            answe++;
                        
            Arrays.sort(wallet);
            Arrays.sort(bill);

        }

        
        
        return answe;
    }
}