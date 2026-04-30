    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String[] parts = br.readLine().trim().split("\\s+");

        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = Long.parseLong(parts[i]);

        long[][] dp = new long[n][3];

        // base case
        dp[0][0] = 0;
        dp[0][1] = a[0];
        dp[0][2] = 0;

        for (int i = 1; i < n; i++) {
            // skip today
            dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));

            // play today (after rest)
            dp[i][1] = dp[i-1][0] + a[i];

            // play today (second consecutive)
            dp[i][2] = dp[i-1][1] + a[i];
        }

        long ans = Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2]));
        System.out.println(ans);
    }
}