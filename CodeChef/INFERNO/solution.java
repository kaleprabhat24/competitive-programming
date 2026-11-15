            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] h = new int[n];
            
            long singleTargetTime = 0;
            int maxHealth = 0;
            
            for (int i = 0; i < n; i++) {
                h[i] = scanner.nextInt();
                // Time for single-target mode: ceil(H[i] / X)
                singleTargetTime += (h[i] + x - 1) / x;
                // Track max health for multi-target mode
                if (h[i] > maxHealth) {
                    maxHealth = h[i];
                }
            }
            
            // Minimum of single-target time and multi-target time
            long minTime = Math.min(singleTargetTime, (long) maxHealth);
            System.out.println(minTime);
        }
        scanner.close();
    }
}
