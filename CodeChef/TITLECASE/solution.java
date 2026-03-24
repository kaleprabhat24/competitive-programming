
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] words = s.split(" ");
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < words.length; i++) {
                String word = words[i];

                // check if acronym (all uppercase)
                boolean isAcronym = true;
                for (char c : word.toCharArray()) {
                    if (Character.isLowerCase(c)) {
                        isAcronym = false;
                        break;
                    }
                }

                if (isAcronym) {
                    result.append(word);
                } else {
                    result.append(Character.toUpperCase(word.charAt(0)));
                    for (int j = 1; j < word.length(); j++) {
                        result.append(Character.toLowerCase(word.charAt(j)));
                    }
                }

                if (i < words.length - 1) result.append(" ");
            }

            System.out.println(result.toString());
        }
    }
}