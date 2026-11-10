        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Loop through each testcase
            while (t-- > 0) {
                int c = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                
                // Calculate the remaining chocolates needed
                int chocolatesToBuy = c - x;
                
                // Calculate total cost
                int totalCost = chocolatesToBuy * y;
                
                // Print the result
                System.out.println(totalCost);
            }
        }
        sc.close();
    }
}
