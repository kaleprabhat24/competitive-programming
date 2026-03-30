import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();

            int alice = 0, bob = 0;
            char server = 'A'; // Alice starts as server

            for (int i = 0; i < n; i++) {
                char winner = s.charAt(i);

                if (winner == server) {
                    if (server == 'A') alice++;
                    else bob++;
                } else {
                    server = winner; // receiver becomes server
                }
            }

            System.out.println(alice + " " + bob);
        }
    }
}