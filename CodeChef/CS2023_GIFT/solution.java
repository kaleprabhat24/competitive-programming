import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read X, N, and M from the input
        int X = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // Check if Om's money + fund is enough to buy the laptop
        if (X + M >= N) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}
