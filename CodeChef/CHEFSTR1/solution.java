class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        // Read number of test cases
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());
        
        while (t-- > 0) {
            // Read N (number of plucks)
            int n = Integer.parseInt(br.readLine().trim());
            
            // Read the space-separated string array
            st = new StringTokenizer(br.readLine());
            int[] s = new int[n];
            for (int i = 0; i < n; i++) {
                s[i] = Integer.parseInt(st.nextToken());
            }
            
            // Calculate total strings skipped
            long totalSkips = 0;
            for (int i = 0; i < n - 1; i++) {
                totalSkips += Math.abs(s[i+1] - s[i]) - 1;
            }
            
            // Output the final result
            System.out.println(totalSkips);
        }
    }
}
