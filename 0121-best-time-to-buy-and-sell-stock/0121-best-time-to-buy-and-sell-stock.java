class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            if(price < minPrice){//5<1
                minPrice=price;// 1
            }
            else{
                int profit=price-minPrice; //5-1 = 4

                if(profit > maxProfit){//4>0
                    maxProfit=profit;//4
                }
            }
        }
        return maxProfit;
    }
}