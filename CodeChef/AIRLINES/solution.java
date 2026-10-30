import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            
            while (t-- > 0) {
                long x = scanner.nextLong(); // Capacity of each airplane
                long y = scanner.nextLong(); // Number of people willing to book
                long z = scanner.nextLong(); // Cost of each ticket
                
                long totalSeats = 10 * x;
                long bookedSeats = Math.min(totalSeats, y);
                long maxEarnings = bookedSeats * z;
                
                System.out.println(maxEarnings);
            }
        }
        scanner.close();
    }
}
