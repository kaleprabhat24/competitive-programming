import java.io.*;

class Codechef {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String[] parts = br.readLine().trim().split("\\s+");

        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(parts[i]);

        // dp[i] = min cost up to day i if we DO work on day i
        long[] dp = new long[n];

        if (n >= 1) dp[0] = a[0];
        if (n >= 2) dp[1] = a[1];
        if (n >= 3) dp[2] = a[2];

        for (int i = 3; i < n; i++) {
            dp[i] = a[i] + Math.min(dp[i - 1], Math.min(dp[i - 2], dp[i - 3]));
        }

        long ans;
        if (n == 1) ans = dp[0];
        else if (n == 2) ans = Math.min(dp[0], dp[1]);
        else ans = Math.min(dp[n - 1], Math.min(dp[n - 2], dp[n - 3]));

        System.out.println(ans);
    }
}