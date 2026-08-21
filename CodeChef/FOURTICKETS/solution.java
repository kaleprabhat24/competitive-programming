import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Process each test case
            while (t-- > 0) {
                int x = sc.nextInt();
                
                // Calculate total cost for 4 friends
                int totalCost = x * 4;
                
                // Check if the total cost does not exceed 1000
                if (totalCost <= 1000) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
