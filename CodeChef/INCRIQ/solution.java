import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read Chef's current IQ
        int x = sc.nextInt();
        
        // Check if Chef's new IQ (current IQ + 7) is strictly greater than Einstein's IQ 
            (170)
        if (x + 7 > 170) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
}
