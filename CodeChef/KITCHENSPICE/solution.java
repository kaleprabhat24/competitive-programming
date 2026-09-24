    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Loop through each test case
            while (t-- > 0) {
                int x = sc.nextInt();
                
                // Determine the category based on the spice level
                if (x < 4) {
                    System.out.println("MILD");
                } else if (x < 7) {
                    System.out.println("MEDIUM");
                } else {
                    System.out.println("HOT");
                }
            }
        }
        sc.close();
    }
}
