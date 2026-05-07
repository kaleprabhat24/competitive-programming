static int calculateMaxProfit(int[] stockPrices) {
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int price : stockPrices) {
        minPrice = Math.min(minPrice, price);
        maxProfit = Math.max(maxProfit, price - minPrice);
    }

    return maxProfit;
}