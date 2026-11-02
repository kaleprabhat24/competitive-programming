    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Loop through each test case
            while (t-- > 0) {
                int w = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                
                // Calculate net monthly gain/loss and multiply by total months
                int finalBalance = w + (x - y) * z;
                
                // Output the result
                System.out.println(finalBalance);
            }
        }
        sc.close();
    }
}
