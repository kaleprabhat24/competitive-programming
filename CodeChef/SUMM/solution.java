    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Loop through each test case
            for (int i = 0; i < t; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                
                // Check if the sum of A and B matches Alice's answer C
                if (a + b == c) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
