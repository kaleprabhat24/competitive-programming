import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int money;

            if (y <= x) {
                money = y;
            } else {
                money = x + 2 * (y - x);
            }

            System.out.println(money);
        }
    }
}