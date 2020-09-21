class Solution {
    fun maxProfit(prices: IntArray): Int {
        if(prices.size == 1) return 0

        var hasStock = false
        var stockBuyPrice = 0
        var stockSellPrice = 0
        var profit = 0

        for(i in 0 until prices.size - 1) {
            if(prices[i+1] > prices[i]) {
                profit += (prices[i+1] - prices[i])
            }
        }

        return profit
    }
}