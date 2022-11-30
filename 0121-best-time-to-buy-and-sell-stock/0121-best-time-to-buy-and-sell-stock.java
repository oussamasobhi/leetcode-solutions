class Solution {
    public int maxProfit(int[] prices) {
       int min=500000;
        int profit=0;
        int todayprofit=0;
            for(int i=0;i<prices.length;i++){
                if(prices[i]<min){
                    min=prices[i];
                }
               todayprofit=prices[i]-min;
                if(todayprofit>profit)
                    profit=todayprofit;
                }
        return profit;
    }
}