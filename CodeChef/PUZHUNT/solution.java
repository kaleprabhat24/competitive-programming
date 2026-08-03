import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        // Correct standard input stream
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            
            // Validate team size limits
            if (n >= 6 && n <= 8) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        
        sc.close();
    }
}
