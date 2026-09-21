        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            
            // Loop through each testcase
            for (int i = 0; i < T; i++) {
                int X = sc.nextInt(); // Cost of a double room
                int Y = sc.nextInt(); // Cost of a triple room
                
                // Calculate both costs
                int costWithDoubleRooms = 3 * X;
                int costWithTripleRooms = 2 * Y;
                
                // Find and print the minimum cost
                int minCost = Math.min(costWithDoubleRooms, costWithTripleRooms);
                System.out.println(minCost);
            }
        }
        sc.close();
    }
}
