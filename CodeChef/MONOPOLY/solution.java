class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int T = sc.nextInt();
        
        // Process each test case
        while (T-- > 0) {
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();
            int r3 = sc.nextInt();
            
            // Check if any single company dominates the other two combined
            if ((r1 > r2 + r3) || (r2 > r1 + r3) || (r3 > r1 + r2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
