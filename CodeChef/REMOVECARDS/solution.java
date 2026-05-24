import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt(); // Number of test cases
            while (t-- > 0) {
                int n = sc.nextInt(); // Number of cards
                int[] counts = new int[101]; // Constraint: Ai <= 100
                int maxFreq = 0;

                for (int i = 0; i < n; i++) {
                    int val = sc.nextInt();
                    counts[val]++;
                    // Keep track of the highest frequency encountered
                    if (counts[val] > maxFreq) {
                        maxFreq = counts[val];
                    }
                }
                
                // Result is Total - Most Frequent
                System.out.println(n - maxFreq);
            }
        }
    }
}
