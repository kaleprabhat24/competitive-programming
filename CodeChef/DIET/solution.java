                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                
                solve(n, k, a);
            }
        }
        sc.close();
    }

    private static void solve(int n, int k, int[] a) {
        long storedProtein = 0;
        
        for (int i = 0; i < n; i++) {
            // Add the protein bought in the morning
            storedProtein += a[i];
            
            // Check if there is enough protein for dinner
            if (storedProtein < k) {
                // Day is 1-indexed, so we print i + 1
                System.out.println("NO " + (i + 1));
                return;
            }
            
            // Eat K grams of protein
            storedProtein -= k;
        }
        
        // If the diet is successfully completed
        System.out.println("YES");
    }
}
