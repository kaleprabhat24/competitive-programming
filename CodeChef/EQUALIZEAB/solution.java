import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // Read the number of test cases
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());

            // Get the absolute difference between A and B
            long diff = Math.abs(a - b);

            // Check if the difference is divisible by 2 * X
            // Use 2L * x to prevent potential 32-bit integer overflow
            if (diff % (2L * x) == 0) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        // Print all outputs at once
        System.out.print(sb);