    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        // Read the total number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Process each testcase
            for (int i = 0; i < t; i++) {
                int c = sc.nextInt();
                
                // Chef considers it HOT if temperature is strictly above 20
                if (c > 20) {
                    System.out.println("HOT");
                } else {
                    System.out.println("COLD");
                }
            }
        }
        
        sc.close();
    }
}
