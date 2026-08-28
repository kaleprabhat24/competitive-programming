import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        // Create a Scanner object to read input from standard input
        Scanner sc = new Scanner(System.in);
        
        // Read the integer X which represents the number of hours taken
        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            
            // Apply the conditional logic based on marathon rules
            if (x < 3) {
                System.out.println("GOLD");
            } else if (x < 6) {
                System.out.println("SILVER");
            } else {
                System.out.println("BRONZE");
            }
        }
    }
}
