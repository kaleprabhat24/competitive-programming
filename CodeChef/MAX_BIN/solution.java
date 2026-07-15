        // Fast I/O to handle constraints efficiently
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            String[] nk = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            String s = br.readLine().trim();
            
            if (s.charAt(0) == '0') {
                // Flip the first character to '1'
                sb.append('1');
                sb.append(s.substring(1));
                // Append remaining K - 1 zeros at the end
                for (int i = 0; i < k - 1; i++) {
                    sb.append('0');
                }
            } else {
                // Keep the string as it is
                sb.append(s);
                // Append all K zeros at the end
                for (int i = 0; i < k; i++) {
                    sb.append('0');
                }
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
