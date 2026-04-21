        
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] parts = br.readLine().trim().split(" ");
            
            long count = 0;
            long len = 1; // current non-decreasing segment length
            
            int prev = Integer.parseInt(parts[0]);
            
            for (int i = 1; i < N; i++) {
                int curr = Integer.parseInt(parts[i]);
                
                if (curr >= prev) {
                    len++;
                } else {
                    count += (len * (len + 1)) / 2;
                    len = 1;
                }
                
                prev = curr;
            }
            
            // last segment
            count += (len * (len + 1)) / 2;
            
            System.out.println(count);
        }
    }
}