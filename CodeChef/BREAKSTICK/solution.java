import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt(); // Number of test cases
            while (t-- > 0) {
                long n = sc.nextLong(); // Total length of stick
                long x = sc.nextLong(); // Target length
                
                // If N is even, it's always possible.
                // If N is odd, X must also be odd.
                if (n % 2 == 0) {
                    System.out.println("YES");
                } else {
                    if (x % 2 != 0) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}
