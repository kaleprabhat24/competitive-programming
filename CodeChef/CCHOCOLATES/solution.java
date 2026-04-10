import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();

            while (t-- > 0) {
                int x = scanner.nextInt(); // Number of 5 rupee coins
                int y = scanner.nextInt(); // Number of 10 rupee coins
                int z = scanner.nextInt(); // Cost of each chocolate
                
                // Calculate total money Chef has
                int totalMoney = (x * 5) + (y * 10);
                
                // Calculate the maximum number of chocolates
                int maxChocolates = totalMoney / z;
                
                // Print the result for the current test case
                System.out.println(maxChocolates);
            }
        }
        scanner.close();
    }
}