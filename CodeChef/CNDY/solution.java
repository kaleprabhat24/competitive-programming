            
            while (t-- > 0) {
                int n = sc.nextInt();
                int totalElements = 2 * n;
                
                // HashMap to store the frequency of each price
                HashMap<Integer, Integer> priceCounts = new HashMap<>();
                boolean isValid = true;
                
                for (int i = 0; i < totalElements; i++) {
                    int price = sc.nextInt();
                    
                    // Update frequency count
                    priceCounts.put(price, priceCounts.getOrDefault(price, 0) + 1);
                    
                    // If any price appears more than 2 times, it's invalid
                    if (priceCounts.get(price) > 2) {
                        isValid = false;
                    }
                }
                
                // Output the result for the current test case
                if (isValid) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
        sc.close();
    }
}
