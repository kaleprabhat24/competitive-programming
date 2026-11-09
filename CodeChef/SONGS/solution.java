import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt(); // Read the number of test cases
            
            while (t-- > 0) {
                int n = sc.nextInt(); // Total journey duration
                int x = sc.nextInt(); // Duration of each song
                
                // One full loop of A -> B -> C takes 3 * X minutes.
                // Song C is only counted when a full loop completes.
                int ans = n / (3 * x);
                
                System.out.println(ans);
            }
        }
        sc.close();
    }
}
