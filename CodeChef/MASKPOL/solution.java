import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt(); // Total people
            int a = scanner.nextInt(); // Infected people
            
            // Uninfected people
            int uninfected = n - a; 
            
            // The minimum number of masks is the size of the smaller group
            System.out.println(Math.min(a, uninfected));
        }
        
        scanner.close();
    }
}
