        String line = br.readLine();
        if (line == null) return;
        int T = Integer.parseInt(line.trim());
        
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            
            // Track the current position of the coin
            int currentCoinPos = X;
            
            // Process each swap
            for (int i = 0; i < S; i++) {
                st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                
                // If the coin is in one of the swapped boxes, update its position
                if (currentCoinPos == A) {
                    currentCoinPos = B;
                } else if (currentCoinPos == B) {
                    currentCoinPos = A;
                }
            }
            
            // Print the final position for this testcase
            System.out.println(currentCoinPos);
        }
    }
}
