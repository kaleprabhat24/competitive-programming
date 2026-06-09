import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            int T = sc.nextInt();
            for(int i = 0; i < T; i++) {
                long N = sc.nextLong();
                long X = sc.nextLong();
                long Y = sc.nextLong();
                
                // Horizontal and vertical cells excluding the queen itself
                long ans = 2 * (N - 1);
                
                // Diagonals: top-left, bottom-right, bottom-left, top-right
                ans += Math.min(X - 1, Y - 1);
                ans += Math.min(N - X, N - Y);
                ans += Math.min(X - 1, N - Y);
                ans += Math.min(N - X, Y - 1);
                
                System.out.println(ans);
            }
        }
        sc.close();
    }
}
