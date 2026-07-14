import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int x = sc.nextInt();
                // Output X-1, X, and X+1 which are distinct and average to X
                System.out.println((x - 1) + " " + x + " " + (x + 1));
            }
        }
        sc.close();
    }
}
