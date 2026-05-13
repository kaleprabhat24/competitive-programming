
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);

                // Check if the current character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    consecutiveConsonants = 0; // Reset count
                } else {
                    consecutiveConsonants++; // Increment count
                }

                // If 4 consecutive consonants are found, flag it
                if (consecutiveConsonants >= 4) {
                    isHard = true;
                    break; 
                }
            }

            // Append output based on problem specification
            if (isHard) {
                out.append("NO\n");
            } else {
                out.append("YES\n");
            }
        }

        // Single print operation
        System.out.print(out);
    }
}