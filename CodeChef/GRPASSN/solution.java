        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            // Frequency array to store counts of each preferred size
            // Size is n + 1 since 2 <= P_i <= n
            int[] count = new int[n + 1];
            
            for (int i = 0; i < n; i++) {
                int p = sc.nextInt();
                count[p]++;
            }
            
            boolean possible = true;
            for (int i = 2; i <= n; i++) {
                // If there are people who want group size i,
                // their count must be perfectly divisible by i.
                if (count[i] > 0 && count[i] % i != 0) {
                    possible = false;
                    break;
                }
            }
            
            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
