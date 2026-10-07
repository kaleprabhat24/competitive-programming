import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Process each test case
            while (t-- > 0) {
                int k = sc.nextInt(); // Total capacity of the bucket
                int x = sc.nextInt(); // Current volume of water in the bucket
                
                // The extra water that can be added is the remaining capacity (K - X)
                System.out.println(k - x);
            }
        }
        sc.close();
    }
}
