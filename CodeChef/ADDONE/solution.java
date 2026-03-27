import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        while (T-- > 0) {
            String s = br.readLine();
            StringBuilder sb = new StringBuilder(s);
            
            int i = sb.length() - 1;
            
            // handle carry
            while (i >= 0 && sb.charAt(i) == '9') {
                sb.setCharAt(i, '0');
                i--;
            }
            
            if (i >= 0) {
                sb.setCharAt(i, (char)(sb.charAt(i) + 1));
                System.out.println(sb.toString());
            } else {
                // all digits were 9
                sb.insert(0, '1');
                System.out.println(sb.toString());
            }
        }
    }
}