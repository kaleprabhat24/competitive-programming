import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                // Read three integers for X, Y, and Z
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                
                // Output the product
                System.out.println(x * y * z);
            }
        }
        sc.close();
    }
}
