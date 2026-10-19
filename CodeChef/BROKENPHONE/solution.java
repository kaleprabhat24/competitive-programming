import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            while (t-- > 0) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                
                if (x < y) {
                    System.out.println("REPAIR");
                } else if (x > y) {
                    System.out.println("NEW PHONE");
                } else {
                    System.out.println("ANY");
                }
            }
        }
        scanner.close();
    }
}
