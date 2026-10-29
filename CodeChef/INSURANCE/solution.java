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
                int y = sc.nextInt();
                
                // The rebated amount is the lesser of the max cap (X) and the actual repair 
                    cost (Y)
                System.out.println(Math.min(x, y));
            }
        }
        sc.close();
    }
}
