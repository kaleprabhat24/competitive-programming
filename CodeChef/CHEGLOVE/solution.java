            for (int i = 0; i < N; i++) {
                G[i] = Integer.parseInt(st.nextToken());
            }
            
            boolean canFront = true;
            boolean canBack = true;
            
            // Check both configurations in a single linear pass
            for (int i = 0; i < N; i++) {
                // Front check: i-th finger vs i-th sheath
                if (L[i] > G[i]) {
                    canFront = false;
                }
                // Back check: i-th finger vs (N - 1 - i)-th sheath
                if (L[i] > G[N - 1 - i]) {
                    canBack = false;
                }
            }
            
            // Determine the correct output based on flags
            if (canFront && canBack) {
                System.out.println("both");
            } else if (canFront) {
                System.out.println("front");
            } else if (canBack) {
                System.out.println("back");
            } else {
                System.out.println("none");
            }
        }
    }
}
