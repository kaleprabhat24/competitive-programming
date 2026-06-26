import java.util.Scanner;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            for (int i = 0; i < t; i++) {
                if (scanner.hasNextInt()) {
                    int n = scanner.nextInt();
                    
                    // Calculate f(N) = (0.143 * N)^N
                    double val = Math.pow(0.143 * n, n);
                    
                    // Print the value rounded to the nearest integer
                    System.out.println(Math.round(val));
                }
            }
        }
        scanner.close();
    }
}
