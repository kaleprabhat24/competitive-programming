        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] parts = br.readLine().trim().split(" ");
            
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(parts[i]);
            }
            
            int[] dp = new int[N];
            dp[N - 1] = 1;
            
            for (int i = N - 2; i >= 0; i--) {
                // check if signs are different
                if ((long)A[i] * A[i + 1] < 0) {
                    dp[i] = dp[i + 1] + 1;
                } else {
                    dp[i] = 1;
                }
            }
            
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                sb.append(dp[i]).append(" ");
            }
            
            System.out.println(sb.toString().trim());
        }
    }
}