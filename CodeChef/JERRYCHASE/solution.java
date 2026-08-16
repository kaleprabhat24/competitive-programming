import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Loop through each test case
            for (int i = 0; i < t; i++) {
                int x = sc.nextInt(); // Jerry's speed
                int y = sc.nextInt(); // Tom's speed
                
                // Tom catches Jerry only if Tom is strictly faster
                if (y > x) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
