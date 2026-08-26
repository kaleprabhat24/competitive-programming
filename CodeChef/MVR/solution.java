    public static void main (String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt(); // Messi's goals
            int b = scanner.nextInt(); // Messi's assists
            int x = scanner.nextInt(); // Ronaldo's goals
            int y = scanner.nextInt(); // Ronaldo's assists
            
            // Calculate total points
            int messiPoints = (a * 2) + b;
            int ronaldoPoints = (x * 2) + y;
            
            // Compare and print result
            if (messiPoints > ronaldoPoints) {
                System.out.println("Messi");
            } else if (ronaldoPoints > messiPoints) {
                System.out.println("Ronaldo");
            } else {
                System.out.println("Equal");
            }
        }
    }
}
