import java.io.*;
import java.util.*;

public class Solution {

    public static String larrysArray(List<Integer> A) {
        int inversions = 0;
        int n = A.size();
        
        // Count total number of inversions
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A.get(i) > A.get(j)) {
                    inversions++;
                }
            }
        }
        
        // If inversions are even, it can be sorted. Otherwise, no.
        if (inversions % 2 == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt(); // Number of test cases
            while (t-- > 0) {
                int n = sc.nextInt(); // Size of array
                List<Integer> A = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    A.add(sc.nextInt());
                }
                System.out.println(larrysArray(A));
            }
        }
        sc.close();
    }
}
