
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());

            int[][] a = new int[N][N];

            // Input triangle
            for (int i = 0; i < N; i++) {
                String[] parts = br.readLine().split(" ");
                for (int j = 0; j <= i; j++) {
                    a[i][j] = Integer.parseInt(parts[j]);
                }
            }

            // Bottom-up DP
            for (int i = N - 2; i >= 0; i--) {
                for (int j = 0; j <= i; j++) {
                    a[i][j] += Math.max(a[i+1][j], a[i+1][j+1]);
                }
            }

            output.append(a[0][0]).append("\n");
        }

        System.out.print(output);
    }
}