        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int t = sc.nextInt();
        
        // Process each test case
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            // Compare the bids to find the highest one
            if (a > b && a > c) {
                System.out.println("Alice");
            } else if (b > a && b > c) {
                System.out.println("Bob");
            } else {
                System.out.println("Charlie");
            }
        }
        
        sc.close();
    }
}
