class Solution {
    public int maxProfit(int[] prices) {
        int a = prices[0];
        int b = 0;
        for (int x : prices) {
            a = Math.min(a, x);
            b = Math.max(b, x - a);
        }
        return b;
    }
}
