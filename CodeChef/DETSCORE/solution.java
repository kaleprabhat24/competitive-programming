import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Loop through each testcase
            for (int i = 0; i < t; i++) {
                int x = sc.nextInt();
                int n = sc.nextInt();
                
                // Each testcase is worth X / 10 points
                int pointsPerTestCase = x / 10;
                
                // Total score is points per testcase multiplied by passed cases
                int totalScore = pointsPerTestCase * n;
                
                System.out.println(totalScore);
            }
        }
        sc.close();
    }
}
