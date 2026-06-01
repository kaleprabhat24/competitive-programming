import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases
        while (t-- > 0) {
            int x = scanner.nextInt(); // Money Ashish has
            int y = scanner.nextInt(); // Cost of Pizza
            int z = scanner.nextInt(); // Cost of Burger

            if (x >= y) {
                System.out.println("PIZZA");
            } else if (x >= z) {
                System.out.println("BURGER");
            } else {
                System.out.println("NOTHING");
            }
        }
        
        scanner.close();
    }
}
