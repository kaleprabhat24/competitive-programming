import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read N and M (number of people)
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // Read X and Y (treats per person)
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        // Calculate total treats
        int totalTreats = (n * x) + (m * y);
        
        // Output the result
        System.out.println(totalTreats);
    }
}
