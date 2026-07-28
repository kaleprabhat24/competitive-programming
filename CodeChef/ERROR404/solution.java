import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Read the response code X
        int x = sc.nextInt();
        
        // Check if the response code matches 404
        if (x == 404) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println("FOUND");
        }
        
        // Close the scanner to prevent memory leaks
        sc.close();
    }
}
