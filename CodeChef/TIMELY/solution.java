import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        // Create scanner to read from standard input stream
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Loop through all test cases
            while (t-- > 0) {
                int x = sc.nextInt();
                
                // It takes 30 minutes to reach. 
                // Chef is on time if he leaves 30 or more minutes early.
                if (x >= 30) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
