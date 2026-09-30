
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Process each testcase
            while (t-- > 0) {
                int x = sc.nextInt();
                
                // Final price is original price (100) minus the discount amount (x)
                int finalPrice = 100 - x;
                
                System.out.println(finalPrice);
            }
        }
        sc.close();
    }
}
