        
        while (T-- > 0) {
            // Read the 26 prices as a string array
            String[] priceTokens = br.readLine().trim().split("\\s+");
            int[] prices = new int[26];
            for (int i = 0; i < 26; i++) {
                prices[i] = Integer.parseInt(priceTokens[i]);
            }
            
            // Read Mathison's initial text
            String s = br.readLine().trim();
            
            // Track seen letters using a boolean array
            boolean[] seen = new boolean[26];
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                seen[ch - 'a'] = true;
            }
            
            // Calculate total cost for all missing letters
            long totalCost = 0;
            for (int i = 0; i < 26; i++) {
                if (!seen[i]) {
                    totalCost += prices[i];
                }
            }
            
            // Output the final minimum cost
            System.out.println(totalCost);
        }
    }
}
