        Scanner sc = new Scanner(System.in);
        
        // Read the total number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Loop through each test case
            while (t-- > 0) {
                int n = sc.nextInt();
                int sum = 0;
                
                // Extract digits and calculate the sum
                while (n > 0) {
                    sum += n % 10; // Extract the last digit
                    n /= 10;       // Remove the last digit
                }
                
                // Output the result for the current test case
                System.out.println(sum);
            }
        }
        sc.close();
    }
}
