import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            
            while (t-- > 0) {
                int n = scanner.nextInt();
                int x = scanner.nextInt();
                
                if (n <= x) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        
        scanner.close();
    }
}
