        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Loop through each testcase
            while (t-- > 0) {
                int x = sc.nextInt();
                
                // Categorize the rainfall based on the given conditions
                if (x < 3) {
                    System.out.println("LIGHT");
                } else if (x >= 3 && x < 7) {
                    System.out.println("MODERATE");
                } else {
                    System.out.println("HEAVY");
                }
            }
        }
        sc.close();
    }
}
