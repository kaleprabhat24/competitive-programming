
class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            while (t-- > 0) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                int z = scanner.nextInt();
                
                if (x > y && x > z) {
                    System.out.println("Setter");
                } else if (y > x && y > z) {
                    System.out.println("Tester");
                } else {
                    System.out.println("Editorialist");
                }
            }
        }
        scanner.close();
    }
}
