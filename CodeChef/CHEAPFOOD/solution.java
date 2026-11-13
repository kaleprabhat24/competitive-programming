class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int x = sc.nextInt();
                
                // Calculate 10% discount
                int percentDiscount = x / 10;
                
                // Flat discount is always 100
                int flatDiscount = 100;
                
                // Print the maximum of the two discounts
                System.out.println(Math.max(percentDiscount, flatDiscount));
            }
        }
        
        sc.close();
    }
}
