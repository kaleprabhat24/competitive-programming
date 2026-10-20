{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Loop through each test case
            while (t-- > 0) {
                int n = sc.nextInt(); // Number of bikes
                int m = sc.nextInt(); // Number of cars
                
                // Calculate total tyres
                int totalTyres = (n * 2) + (m * 4);
                
                // Print the result for the current test case
                System.out.println(totalTyres);
            }
        }
        sc.close();
    }
}
