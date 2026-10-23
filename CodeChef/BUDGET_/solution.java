class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Loop through each testcase
            while (t-- > 0) {
                int x = sc.nextInt(); // Total budget Akshat has
                int y = sc.nextInt(); // Daily expenditure
                
                // Check if budget is enough for 30 days
                if (x >= 30 * y) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
