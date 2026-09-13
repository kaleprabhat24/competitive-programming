    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            
            // Loop through each test case
            while (t-- > 0) {
                int x = scanner.nextInt(); // Interest rate
                int y = scanner.nextInt(); // Inflation rate
                
                // Check if interest rate is at least twice the inflation rate
                if (x >= 2 * y) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        
        scanner.close();
    }
}
