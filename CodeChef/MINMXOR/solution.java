        String tStr = br.readLine();
        if (tStr == null) return;
        int t = Integer.parseInt(tStr.trim());
        
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];
            int totalXor = 0;
            
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                totalXor ^= a[i];
            }
            
            // Best case: removing nothing
            int minXor = totalXor;
            
            // Try removing each element one by one
            for (int i = 0; i < n; i++) {
                int currentXor = totalXor ^ a[i];
                if (currentXor < minXor) {
                    minXor = currentXor;
                }
            }
            sb.append(minXor).append("\n");
        }
        System.out.print(sb);
    }
}
