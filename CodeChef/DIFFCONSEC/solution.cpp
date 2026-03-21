import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int operations = 0;
            int count = 1;

            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    count++;
                } else {
                    operations += (count - 1);
                    count = 1;
                }
            }

            operations += (count - 1);

            System.out.println(operations);
        }
    }
}