import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            
            while (T-- > 0) {
                // Read A and B
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                // Calculate and print the remainder
                System.out.println(a % b);
            }
        }
    }
}
