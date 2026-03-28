        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();

            int count = 0;
            boolean happy = false;

            for (int i = 0; i < s.length(); i++) {
                if (isVowel(s.charAt(i))) {
                    count++;
                    if (count >= 3) {
                        happy = true;
                        break;
                    }
                } else {
                    count = 0; // reset if consonant
                }
            }

            if (happy) {
                System.out.println("Happy");
            } else {
                System.out.println("Sad");
            }
        }
    }
}