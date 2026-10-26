        int ans = 0;
        
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            
            if (x % k == 0) {
                ans++;
            }
        }

        System.out.println(ans);
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());