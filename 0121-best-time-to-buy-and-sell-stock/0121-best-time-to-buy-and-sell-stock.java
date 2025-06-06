class Solution {
    public int maxProfit(int[] prices) {
        
        int minProfit = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price:prices){
            if(price < minProfit){
                minProfit = price;
            }
            maxProfit = Math.max(price - minProfit,maxProfit);
        }
        return maxProfit;
    }
}