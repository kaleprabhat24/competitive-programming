    public static void main (String[] args) throws java.lang.Exception {
        // CHANGED: System.class replaced with System.in
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] frequency = new int[101];
            
            for (int i = 0; i < n; i++) {
                int animalType = sc.nextInt();
                frequency[animalType]++;
            }
            
            boolean possible = true;
            for (int i = 1; i <= 100; i++) {
                if (frequency[i] % 2 != 0) {
                    possible = false;
                    break;
                }
            }
            
            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
