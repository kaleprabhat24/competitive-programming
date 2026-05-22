import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int a = sc.nextInt(); // Votes for Party A
                int b = sc.nextInt(); // Votes for Party B
                int c = sc.nextInt(); // Votes for Party C
                
                // Check if any party has a strict majority (> 50 votes)
                if (a > 50) {
                    System.out.println("A");
                } else if (b > 50) {
                    System.out.println("B");
                } else if (c > 50) {
                    System.out.println("C");
                } else {
                    System.out.println("NOTA");
                }
            }
        }
        sc.close();
    }
}
