import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            // Loop through each testcase
            while (t-- > 0) {
                int x = sc.nextInt();
                
                // Calculate cost: Chef pays for at least 300 kms
                int distanceToPay = Math.max(300, x);
                int totalCost = distanceToPay * 10;
                
                System.out.println(totalCost);
            }
        }
        sc.close();
    }
}
