
class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int t = sc.nextInt();
        
        // Process each test case
        while (t-- > 0) {
            int x = sc.nextInt();
            
            // Check if the time is between 1 pm and 4 pm (inclusive)
            if (x >= 1 && x <= 4) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
