import java.util.Scanner;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            int G = sc.nextInt();
            
            for (int g = 0; g < G; g++) {
                int I = sc.nextInt(); // Initial state
                int N = sc.nextInt(); // Number of coins
                int Q = sc.nextInt(); // Target face
                
                if (N % 2 == 0) {
                    System.out.println(N / 2);
                } else {
                    if (I == Q) {
                        System.out.println(N / 2);
                    } else {
                        System.out.println((N + 1) / 2);
                    }
                }
            }
        }
        sc.close();
    }
}
