
                if (arr[i] == arr[j]) {
                    if (len == 2) {
                        isPal[i][j] = true;
                    } else {
                        isPal[i][j] = isPal[i + 1][j - 1];
                    }
                }
            }
        }

        // Step 2: DP for minimum partitions
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);

        for (int i = 0; i < n; i++) {
            if (isPal[0][i]) {
                dp[i] = 1;
            } else {
                for (int j = 1; j <= i; j++) {
                    if (isPal[j][i]) {
                        dp[i] = Math.min(dp[i], dp[j - 1] + 1);
                    }
                }
            }
        }

        System.out.println(dp[n - 1]);
    }
}