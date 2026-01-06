package com.arrays;

public class StockBuySell {

	public static void main(String args[]) {

		/*121
		 * You are given an array prices where prices[i] is the price of a given stock
		 * on the ith day.
		 * 
		 * You want to maximize your profit by choosing a single day to buy one stock
		 * and choosing a different day in the future to sell that stock.
		 * 
		 * Return the maximum profit you can achieve from this transaction. If you
		 * cannot achieve any profit, return 0.
		 * 
		 * Input: prices = [7,1,5,3,6,4] Output: 5 Explanation: Buy on day 2 (price = 1)
		 * and sell on day 5 (price = 6), profit = 6-1 = 5. Note that buying on day 2
		 * and selling on day 1 is not allowed because you must buy before you sell.
		 */

		//int[] array = { 7, 1, 5, 3, 6, 4 };
		int[] array = {7,1,5,3,6,4};
		System.out.println(maxProfit(array));
	}

	public static int maxProfit(int[] prices) {
		
		int buy = prices[0];
        int profit = 0;
        int profitTemp= 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            profitTemp = prices[i] - buy ;
            if(profit < profitTemp){
            	profit = profitTemp;
            }
            
            //profit = Math.max(profit,prices[i]-buy);
        }
        return profit;
        
        
		/*
		 * int buy = prices[0]; int buyIndex = 0, sellIndex = 0; int sell = 0; int i;
		 * 
		 * for (i = 1; i < prices.length-1; i++) { if ((prices[i] < buy) && (prices[i]
		 * != 0 )) { buy = prices[i]; buyIndex = i;
		 * 
		 * }
		 * 
		 * } System.out.println(buyIndex); if (buyIndex == prices.length - 1) { return
		 * 0; } else {
		 * 
		 * for (int j = buyIndex; j < prices.length; j++) { if (prices[j] > sell) sell =
		 * prices[j]; sellIndex = j; } }
		 * 
		 * int profit =sell- buy; return profit;
		 */
	}
}
