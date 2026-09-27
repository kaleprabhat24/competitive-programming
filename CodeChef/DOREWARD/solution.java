
class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        // Corrected standard input stream to System.in
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int x = sc.nextInt();
                
                if (x <= 3) {
                    System.out.println("BRONZE");
                } else if (x <= 6) {
                    System.out.println("SILVER");
                } else {
                    System.out.println("GOLD");
                }
            }
        }
        sc.close();
    }
}
