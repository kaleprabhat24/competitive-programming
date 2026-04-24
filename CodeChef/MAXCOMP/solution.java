            Event[] arr = new Event[N];
            for (int i = 0; i < N; i++) {
                String[] parts = br.readLine().split(" ");
                int s = Integer.parseInt(parts[0]);
                int e = Integer.parseInt(parts[1]);
                int c = Integer.parseInt(parts[2]);
                arr[i] = new Event(s, e, c);
            }

            // Sort by end time
            Arrays.sort(arr, (a, b) -> a.end - b.end);

            long[] dp = new long[N];
            dp[0] = arr[0].profit;

            for (int i = 1; i < N; i++) {
                long include = arr[i].profit;

                int idx = findLastNonOverlap(arr, i);
                if (idx != -1) include += dp[idx];

                dp[i] = Math.max(dp[i - 1], include);
            }

            out.append(dp[N - 1]).append("\n");
        }

        System.out.print(out);
    }
}