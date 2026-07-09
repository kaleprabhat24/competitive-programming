import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int[] minValues = new int[3];
            minValues[0] = sc.nextInt();
            minValues[1] = sc.nextInt();
            minValues[2] = sc.nextInt();
            
            // Sort to easily find the two smallest values
            Arrays.sort(minValues);
            
            // The two smallest numbers must be equal
            if (minValues[0] == minValues[1]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
