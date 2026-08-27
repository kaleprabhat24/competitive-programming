import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            while (t-- > 0) {
                int k = scanner.nextInt();
                int x = scanner.nextInt();
                
                int totalDays = k * 7;
                int remainingDays = totalDays - x;
                
                System.out.println(remainingDays);
            }
        }
        scanner.close();
    }
}
