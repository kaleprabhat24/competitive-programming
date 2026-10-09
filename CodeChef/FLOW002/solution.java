class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        // Create a Scanner object to read input from standard input
        Scanner sc = new Scanner(System.in);
        
        // Read the total number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Loop through each test case
            for (int i = 0; i < t; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                // Calculate the remainder using the modulo operator (%)
                int remainder = a % b;
                
                // Print the result on a new line
                System.out.println(remainder);
            }
        }
        sc.close();
    }
}
