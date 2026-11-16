import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            StringBuilder out = new StringBuilder();
            
            while (t-- > 0) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                
                if (a == b || b - a >= a) {
                    out.append("YES\n");
                } else {
                    out.append("NO\n");
                }
            }
            System.out.print(out);
        }
        sc.close();
    }
}
