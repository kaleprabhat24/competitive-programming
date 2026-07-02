import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        // Fast I/O reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            
            if (n == 1) {
                out.println(1);
            } else if (n == 2 || n == 3) {
                out.println(n - 1);
            } else {
                out.println(n);
            }
        }
        out.flush();
    }
}
