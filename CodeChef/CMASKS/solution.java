        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int x = sc.nextInt(); // Cost of 1 disposable mask
                int y = sc.nextInt(); // Cost of 1 cloth mask
                
                // Calculate total cost for 100 days
                int totalDisposableCost = 100 * x;
                int totalClothCost = 10 * y;
                
                // Tie goes to CLOTH due to eco-friendly rule
                if (totalClothCost <= totalDisposableCost) {
                    System.out.println("CLOTH");
                } else {
                    System.out.println("DISPOSABLE");
                }
            }
        }
        sc.close();
    }
}
