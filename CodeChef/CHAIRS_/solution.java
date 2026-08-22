
class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Loop through each test case
            while (t-- > 0) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                
                // Calculate required chairs
                int extraChairs = Math.max(0, x - y);
                
                // Print the result
                System.out.println(extraChairs);
            }
        }
        sc.close();
    }
}
