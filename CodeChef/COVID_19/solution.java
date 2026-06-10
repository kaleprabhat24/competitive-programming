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
                int m = sc.nextInt();
                
                // Calculate maximum usable rows
                int maxRows = (n + 1) / 2;
                
                // Calculate maximum usable seats per row
                int maxSeatsPerRow = (m + 1) / 2;
                
                // Total tickets is the product of both
                int maxTickets = maxRows * maxSeatsPerRow;
                
                System.out.println(maxTickets);
            }
        }
        sc.close();
    }
}
