
class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            st = new StringTokenizer(br.readLine());
            
            int oddCount = 0;
            for (int i = 0; i < n; i++) {
                long num = Long.parseLong(st.nextToken());
                if (num % 2 != 0) {
                    oddCount++;
                }
            }

            // Total sum is even if and only if the count of odd numbers is even.
            // We also need at least one odd number to create odd-sum subsets.
            if (oddCount > 0 && oddCount % 2 == 0) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
        out.flush();
    }
}
