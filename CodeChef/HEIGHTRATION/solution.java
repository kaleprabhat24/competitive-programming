import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the two integers a and b
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Find and print the maximum of the two numbers
        int height = Math.max(a, b);
        System.out.println(height);
    }
}
