        
        while (T-- > 0) {
            int N = sc.nextInt();
            String A = sc.next();
            
            int zeros = 0;
            for (int i = 0; i < N; i++) {
                if (A.charAt(i) == '0') {
                    zeros++;
                }
            }
            
            for (int i = 0; i < zeros; i++) {
                out.append('0');
            }
            for (int i = zeros; i < N; i++) {
                out.append('1');
            }
            out.append('\n');
        }
        
        System.out.print(out.toString());
    }
}
