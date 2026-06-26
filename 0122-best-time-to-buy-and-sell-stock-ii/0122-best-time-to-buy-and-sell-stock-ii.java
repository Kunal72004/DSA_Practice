class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int maxProfit = 0;
        int min =prices[0];
        for(int i=1; i<n; i++){
            int profit = prices[i]-min;
            if(profit > 0){
                maxProfit += profit;
                min = prices[i];
            }

            if(prices[i]<min){
                min = prices[i];
            }
            
        }
        return maxProfit;
    }
}