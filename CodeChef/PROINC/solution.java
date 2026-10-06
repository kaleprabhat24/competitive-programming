
class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Process each test case
            while (t-- > 0) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                
                // Calculate new profit
                int newProfit = y + (x / 10);
                
                // Print the result
                System.out.println(newProfit);
            }
        }
        sc.close();
    }
}
