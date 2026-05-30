        // Check if there is an integer token available to avoid NoSuchElementException
        if (!s.hasNextInt()) return;
        int t = s.nextInt();
        
        while (t-- > 0) {
            int n = s.nextInt();
            int p1 = -1;
            int p2 = -1;
            
            for (int i = 0; i < n; i++) {
                int val = s.nextInt();
                if (val == 1) {
                    p1 = i; // Index of element 1
                }
                if (val == n) {
                    p2 = i; // Index of element N
                }
            }
            
            // Base calculation for individual element moves
            int moves = p1 + (n - 1 - p2);
            
            // If 1 is to the right of N, they cross each other, saving 1 move
            if (p1 > p2) {
                moves--;
            }
            
            System.out.println(moves);
        }
        s.close();
    }
}
