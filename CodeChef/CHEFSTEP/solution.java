    public static void main (String[] args) throws java.lang.Exception
    {
        // Use BufferedReader for fast I/O operations
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read number of test cases
        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            String[] firstLine = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(firstLine[0]);
            int k = Integer.parseInt(firstLine[1]);
            
            String[] secondLine = br.readLine().trim().split("\\s+");
            StringBuilder result = new StringBuilder();
            
            for (int i = 0; i < n; i++) {
                int d = Integer.parseInt(secondLine[i]);
                
                // Check if the distance is perfectly divisible by step length K
                if (d % k == 0) {
                    result.append("1");
                } else {
                    result.append("0");
                }
            }
            
            // Print the final binary string for the current test case
            System.out.println(result.toString());
        }
    }
}
