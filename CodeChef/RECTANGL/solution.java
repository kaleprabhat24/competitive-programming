import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        // Changed System.String to System.in to fix the compilation error
        Scanner sc = new Scanner(System.in); 
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int[] sides = new int[4];
                sides[0] = sc.nextInt();
                sides[1] = sc.nextInt();
                sides[2] = sc.nextInt();
                sides[3] = sc.nextInt();
                
                // Sort the sides to easily check pairings
                Arrays.sort(sides);
                
                // A rectangle must have two pairs of equal opposite sides
                if (sides[0] == sides[1] && sides[2] == sides[3]) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
