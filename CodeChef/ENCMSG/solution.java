import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt(); // Number of test cases
            while (t-- > 0) {
                int n = sc.nextInt(); // Length of string
                char[] s = sc.next().toCharArray();

                // Step 1: Swap adjacent characters
                for (int i = 0; i < n - 1; i += 2) {
                    char temp = s[i];
                    s[i] = s[i + 1];
                    s[i + 1] = temp;
                }

                // Step 2: Replace with opposite character
                // Formula: 'z' - (current_char - 'a')
                for (int i = 0; i < n; i++) {
                    s[i] = (char) ('z' - (s[i] - 'a'));
                }

                System.out.println(new String(s));
            }
        }
        sc.close();
    }
}
