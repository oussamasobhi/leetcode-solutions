class Solution {
    public int maxProfit(int[] prices) {
       int min=500000;
        int profit=0;
        int pr=0;
            for(int i=0;i<prices.length;i++){
                if(prices[i]<min){
                    min=prices[i];
                }
               pr=prices[i]-min;
                if(pr>profit)
                    profit=pr;
                }
        return profit;
    }
}