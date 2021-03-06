// William Thing

/*
 * Say you have an array for which the ith element is the price of a 
 * given stock on day i.

If you were only permitted to complete at most one transaction 
(ie, buy one and sell one share of the stock), 
design an algorithm to find the maximum profit.
 */

public class BuyAndSellStocks {
	
	public static void main(String[] arg) {
		int[] prices = {7, 8, 2, 9, 10, 0, 2, 3, 9, 5};
		int result = maxProfit(prices);
		System.out.println(result);
	}
	
	public static int maxProfit(int[] prices) {
		if (prices == null || prices.length < 2) 
			return 0;
		int maxProfit = 0;
		int cheapestPrice = prices[0];
		for (int i = 0; i < prices.length; i++) {
			if (cheapestPrice > prices[i]) {
				cheapestPrice = prices[i];
			} else {
				if (maxProfit < (prices[i] - cheapestPrice))
					maxProfit = prices[i] - cheapestPrice;
			}
		}
		return maxProfit;
	}
}
