import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                // Since 1 hour has 60 minutes and 1 game takes 20 minutes, 
                // Chef can play 60 / 20 = 3 games per hour.
                System.out.println(n * 3);
            }
        }
        sc.close();
    }
}
