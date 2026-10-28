class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        // Corrected System.class to System.in
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            
            for (int i = 0; i < T; i++) {
                int N = sc.nextInt();
                int M = sc.nextInt();
                int K = sc.nextInt();
                
                if (N + K <= M) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
        sc.close();
    }
}
