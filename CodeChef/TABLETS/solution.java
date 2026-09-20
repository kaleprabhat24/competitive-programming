        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int t = sc.nextInt();
        
        // Process each testcase
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            // Calculate total tablets required
            int requiredTablets = 3 * x;
            
            // Check if available tablets are enough
            if (y >= requiredTablets) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
