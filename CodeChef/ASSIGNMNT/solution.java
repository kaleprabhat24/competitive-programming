
class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                long x = sc.nextLong(); // number of assignments
                long y = sc.nextLong(); // time taken per assignment in minutes
                long z = sc.nextLong(); // number of days

                long totalTimeNeeded = x * y;
                long totalTimeAvailable = z * 24 * 60; // Z days in minutes

                if (totalTimeNeeded <= totalTimeAvailable) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
