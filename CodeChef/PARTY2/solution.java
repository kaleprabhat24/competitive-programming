    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            
            // Loop through each test case
            for (int i = 0; i < T; i++) {
                int N = sc.nextInt(); // Number of friends
                int X = sc.nextInt(); // Cost of each burger
                int K = sc.nextInt(); // Total money Chef has
                
                // Check if total cost is less than or equal to available money
                if (N * X <= K) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
