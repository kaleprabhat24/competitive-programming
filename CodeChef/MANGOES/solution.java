        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Loop through each test case
            while (t-- > 0) {
                int x = sc.nextInt(); // Weight of a mango
                int y = sc.nextInt(); // Weight of the truck
                int z = sc.nextInt(); // Weight the bridge can withstand
                
                // Calculate the remaining capacity for mangoes
                int remainingWeight = z - y;
                
                // Calculate maximum number of mangoes
                int maxMangoes = remainingWeight / x;
                
                // Output the result
                System.out.println(maxMangoes);
            }
        }
        sc.close();
    }
}
