    public static void main (String[] args) throws java.lang.Exception {
        // Fast I/O for performance
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            String S = br.readLine().trim();
            
            // Track character frequencies
            int[] freq = new int[26];
            boolean hasDuplicate = false;
            
            for (int i = 0; i < N; i++) {
                int charIndex = S.charAt(i) - 'a';
                freq[charIndex]++;
                if (freq[charIndex] > 1) {
                    hasDuplicate = true;
                    // We can break early since finding one duplicate is enough
                    break;
                }
            }
            
            // If duplicate exists, max deleted length is N - 2, otherwise -1
            if (hasDuplicate) {
                System.out.println(N - 2);
            } else {
                System.out.println(-1);
            }
        }
    }
}
