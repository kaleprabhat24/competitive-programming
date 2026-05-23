        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            while (t-- > 0) {
                String s1 = scanner.nextLine();
                String s2 = scanner.nextLine();

                int minDiff = 0;
                int maxDiff = 0;

                for (int i = 0; i < s1.length(); i++) {
                    char ch1 = s1.charAt(i);
                    char ch2 = s2.charAt(i);

                    if (ch1 == '?' || ch2 == '?') {
                        maxDiff++;
                    } else if (ch1 != ch2) {
                        minDiff++;
                        maxDiff++;
                    }
                }

                System.out.println(minDiff + " " + maxDiff);
            }
        }
        scanner.close();
    }
}
