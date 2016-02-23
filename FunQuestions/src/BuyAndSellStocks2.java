
public class BuyAndSellStocks2 {
	
	public static main String(String[] arg) {
		int[] prices = {7, 8, 2, 9, 10, 1, 2, 3, 8, 5};
		
	}
	
	public static int maxProfit(int[] prices) {
		if (prices == null || prices.length == 1)
			return 0;
		
		int n = prices.length;
		int peak = prices[n-1];
		int profit = 0;
		for (int day = n-2; day >= 0; day--) {
			if (peak < prices[day]) {
				
			}
		}
	}

}
