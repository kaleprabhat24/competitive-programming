import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int x = sc.nextInt();
                
                // Calculate the actual stored value using the modulo operator
                int result = x % (n + 1);
                System.out.println(result);
            }
        }
        sc.close();
    }
}
