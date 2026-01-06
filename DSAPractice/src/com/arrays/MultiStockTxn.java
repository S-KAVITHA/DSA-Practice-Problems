package com.arrays;

public class MultiStockTxn {

	public int maxProfit(int[] prices) {
		int fBuy = Integer.MAX_VALUE, sBuy = Integer.MAX_VALUE, fSell = 0, sSell = 0;
		for (int i = 0; i < prices.length; i++) {

			fBuy = Math.min(fBuy, prices[i]);
			fSell = Math.max(fSell, prices[i] - fBuy);

			sBuy = Math.min(sBuy, prices[i] - fSell);
			sSell = Math.max(sSell, prices[i] - sBuy);
		}

		return sSell;
	}
}
