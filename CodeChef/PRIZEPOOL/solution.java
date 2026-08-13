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
                
                // Top 10 get X, ranks 11 to 100 (90 participants) get Y
                int totalPrizeMoney = (10 * x) + (90 * y);
                
                System.out.println(totalPrizeMoney);
            }
        }
        sc.close();
    }
}
