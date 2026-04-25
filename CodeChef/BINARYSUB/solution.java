static class Solution {
    static final int MOD = 998244353;

    public int countWays(String s) {
        int n = s.length();
        long[] dp = new long[n + 1];

        dp[0] = 1; // empty string

        for (int i = 1; i <= n; i++) {
            // Take single character
            dp[i] = dp[i - 1] % MOD;

            // Take pair
            if (i >= 2) {
                String sub = s.substring(i - 2, i);
                if (sub.equals("ab") || sub.equals("ba")) {
                    dp[i] = (dp[i] + dp[i - 2]) % MOD;
                }
            }
        }

        return (int) dp[n];
    }
}