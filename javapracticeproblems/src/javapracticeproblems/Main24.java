package javapracticeproblems;
import java.util.*;
public class Main24 {
//The cost of a stock on each day is given in an array. Find the maximum profit that you
//can make by buying and selling on those days. If the given array of prices is sorted in
//decreasing order, then profit cannot be earned at all.
//Input: arr[] = {100, 180, 260, 310, 40, 535, 695}
//Output: 865
//Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210
//Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655
//Maximum Profit = 210 + 655 = 865
//Input: arr[] = {4, 2, 2, 2, 4}
//Output: 2
//Explanation: Buy the stock on day 1 and sell it on day 4 => 4 – 2 = 2
//Maximum Profit = 2		
		static int maxProfit(int price[],int start,int end) {
			if(end<=start)
				return 0;
			int profit=0;
			for(int i=start;i<end;i++) {
				for (int j = i + 1; j <= end; j++) {
					if (price[j] > price[i]) {
					int curr_profit = price[j] - price[i] +
					maxProfit(price, start, i - 1) + maxProfit(price, j + 1, end);
					profit = Math.max(profit, curr_profit);
					}
					}
					}
					return profit;
		}
			public static void main(String[] args) {
				int price[] = { 100, 180, 260, 310, 40, 535, 695 };
				int n = price.length;
				System.out.print(maxProfit(price, 0, n - 1));
				}
	}