import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        
        StringBuilder out = new StringBuilder();
        
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long m = Long.parseLong(st.nextToken());
            
            st = new StringTokenizer(br.readLine());
            long maxDistance = 0;
            
            for (int i = 0; i < n; i++) {
                long aVal = Long.parseLong(st.nextToken());
                // Maximum distance contribution for aVal is either to 1 or to m
                maxDistance += Math.max(Math.abs(aVal - 1), Math.abs(m - aVal));
            }
            
            out.append(maxDistance).append("\n");
        }
        System.out.print(out);
    }
}
