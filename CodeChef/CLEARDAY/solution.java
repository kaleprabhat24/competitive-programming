import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read X (rainy days) and Y (cloudy days)
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        // Calculate clear days: total days (7) - rainy - cloudy
        int clearDays = 7 - x - y;
        
        // Output the result
        System.out.println(clearDays);
        
        sc.close();
    }
}