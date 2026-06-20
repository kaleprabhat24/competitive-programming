class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int c = sc.nextInt();
            
            int totalSum = 0;
            int totalCost = 0;
            
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                // Check if upgrading this specific bag yields a net profit
                if ((x - a) > c) {
                    totalSum += x;
                    totalCost += c;
                } else {
                    totalSum += a;
                }
            }
            
            System.out.println(totalSum - totalCost);
        }
        sc.close();
    }
}
