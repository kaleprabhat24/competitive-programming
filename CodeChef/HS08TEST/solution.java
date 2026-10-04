import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        // Read the withdrawal amount and initial balance
        if (sc.hasNextInt()) {
            int X = sc.nextInt();
            double Y = sc.nextDouble();
            
            // Check if withdrawal amount is a multiple of 5 
            // and if the account has enough balance (including the 0.50 bank charge)
            if (X % 5 == 0 && Y >= (X + 0.50)) {
                Y = Y - X - 0.50;
            }
            
            // Output the final balance with 2 decimal places
            System.out.printf("%.2f\n", Y);
        }
        
        sc.close();
    }
}
