
class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            
            // Loop through each test case
            for (int i = 0; i < T; i++) {
                int X = sc.nextInt();
                
                // Check if time remaining is strictly greater than 24 minutes
                if (X > 24) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
