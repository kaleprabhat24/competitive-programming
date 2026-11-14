import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            
            while (t-- > 0) {
                int n = scanner.nextInt();
                int a = scanner.nextInt();
                
                int k = (int) Math.sqrt(n);
                System.out.println(k * a);
            }
        }
        
        scanner.close();
    }
}
