import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        // Read the total number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Loop through each test case
            while (t-- > 0) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                
                // Ezio can manipulate them all if X is greater than or equal to Y
                if (x >= y) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
