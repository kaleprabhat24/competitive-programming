import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the total number of triplets
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            
            // Loop through each triplet
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                
                // Find the second-maximum number using conditional logic
                if ((a > b && a < c) || (a < b && a > c)) {
                    System.out.println(a);
                } else if ((b > a && b < c) || (b < a && b > c)) {
                    System.out.println(b);
                } else {
                    System.out.println(c);
                }
            }
        }
        sc.close();
    }
}
