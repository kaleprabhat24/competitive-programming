class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            for (int t = 0; t < T; t++) {
                int N = sc.nextInt();
                String gestures = sc.next();
                
                boolean hasI = false;
                boolean hasY = false;
                
                for (int i = 0; i < N; i++) {
                    char c = gestures.charAt(i);
                    if (c == 'I') {
                        hasI = true;
                    } else if (c == 'Y') {
                        hasY = true;
                    }
                }
                
                if (hasI) {
                    System.out.println("INDIAN");
                } else if (hasY) {
                    System.out.println("NOT INDIAN");
                } else {
                    System.out.println("NOT SURE");
                }
            }
        }
    }
}
