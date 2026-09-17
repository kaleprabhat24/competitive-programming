class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            
            // Loop through each test case
            while (t-- > 0) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                
                // Compare X and Y
                if (x > y) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        scanner.close();
    }
}
