import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int t = sc.nextInt();
        
        // Process each test case
        while (t-- > 0) {
            int x = sc.nextInt();
            
            // The minimum number of coins is the remainder of X divided by 10
            System.out.println(x % 10);
        }
        
        sc.close();
    }
}
