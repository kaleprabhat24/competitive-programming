import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        // Corrected: Pass System.in to read from standard input
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            
            for (int i = 0; i < T; i++) {
                int G = sc.nextInt();
                int B = sc.nextInt();
                
                System.out.println(B - G);
            }
        }
        sc.close();
    }
}
