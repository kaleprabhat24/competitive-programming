        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int t = sc.nextInt();
        
        // Process each test case
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            
            // Calculate the total perimeter of the rectangular plate
            int perimeter = 2 * (n + m);
            
            // Calculate the total cost
            int totalCost = perimeter * x;
            
            // Print the result for the current test case
            System.out.println(totalCost);
        }
        
        sc.close();
    }
}
