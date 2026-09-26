class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Loop through each test case
            while (t-- > 0) {
                int x = sc.nextInt(); // Fuel in liters
                int y = sc.nextInt(); // Distance to home in kilometers
                
                // Chef can travel 5 km per liter, so total distance = 5 * x
                if (5 * x >= y) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
