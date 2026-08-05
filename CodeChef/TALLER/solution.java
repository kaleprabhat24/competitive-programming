import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        // Create a Scanner object to read inputs from the user
        Scanner sc = new Scanner(System.in);
        
        // Read the total number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Loop through each test case
            for (int i = 0; i < t; i++) {
                int x = sc.nextInt(); // Alice's height
                int y = sc.nextInt(); // Bob's height
                
                // Compare heights and print the result
                if (x > y) {
                    System.out.println("A");
                } else {
                    System.out.println("B");
                }
            }
        }
        sc.close();
    }
}
