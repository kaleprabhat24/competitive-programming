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
                if (x <= 70) {
                    System.out.println(0);
                } else if (x <= 100) {
                    System.out.println(500);
                } else {
                    System.out.println(2000);
                }
            }
        }
        sc.close();
    }
}
