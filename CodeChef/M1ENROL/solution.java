    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the total number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Process each test case
            while (t-- > 0) {
                int x = sc.nextInt(); // Current available seats
                int y = sc.nextInt(); // Interested students
                
                // If interested students exceed the available seats
                if (y > x) {
                    System.out.println(y - x);
                } else {
                    // Seats are already sufficient
                    System.out.println(0);
                }
            }
        }
        sc.close();
    }
}
