class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            
            int c0 = 0;
            int c1 = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    c0++;
                } else {
                    c1++;
                }
            }
            
            int ans;
            if (c0 == c1) {
                ans = 2 * c0;
            } else {
                ans = 2 * Math.min(c0, c1) + 1;
            }
            
            out.println(ans);
        }
        out.flush();
    }
}
