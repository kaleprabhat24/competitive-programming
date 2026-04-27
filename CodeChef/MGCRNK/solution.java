
        while (T-- > 0) {
            N = Integer.parseInt(br.readLine().trim());
            grid = new double[N][N];

            for (int i = 0; i < N; i++) {
                String[] parts = br.readLine().trim().split("\\s+");
                for (int j = 0; j < N; j++) {
                    grid[i][j] = Integer.parseInt(parts[j]);
                }
            }

            double low = -2500, high = 2500, ans = -1;

            for (int iter = 0; iter < 60; iter++) {
                double mid = (low + high) / 2;

                if (can(mid)) {
                    ans = mid;
                    low = mid;
                } else {
                    high = mid;
                }
            }

            if (ans < 0) System.out.println("Bad Judges");
            else System.out.printf("%.6f\n", ans);
        }
    }
}