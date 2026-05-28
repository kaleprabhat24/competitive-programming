import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt(); // Number of test cases
            while (t-- > 0) {
                long n = sc.nextLong();
                
                // Count of odd numbers between 1 and N
                long oddCount = (n + 1) / 2;
                
                // Count of even numbers between 1 and N
                long evenCount = n / 2;
                
                // Total pairs (A, B) where A+B is odd
                // Either (Odd, Even) or (Even, Odd)
                long result = 2 * oddCount * evenCount;
                
                System.out.println(result);
            }
        }
        sc.close();
    }
}
