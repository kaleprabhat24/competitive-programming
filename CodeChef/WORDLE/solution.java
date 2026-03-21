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
            String s = sc.next();
            String tStr = sc.next();

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < 5; i++) {
                if (s.charAt(i) == tStr.charAt(i)) {
                    result.append('G');
                } else {
                    result.append('B');
                }
            }

            System.out.println(result.toString());
        }
    }
}