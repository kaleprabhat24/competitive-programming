import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        String line = br.readLine();
        if (line != null) {
            int t = Integer.parseInt(line.trim());
            StringBuilder sb = new StringBuilder();
            
            while (t-- > 0) {
                st = new StringTokenizer(br.readLine());
                long l = Long.parseLong(st.nextToken());
                long k = Long.parseLong(st.nextToken());
                
                if (l % k == 0) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(1).append("\n");
                }
            }
            // Corrected to System.out.print
            System.out.print(sb);
        }
    }
}
