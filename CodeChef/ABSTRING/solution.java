            String s = br.readLine().trim();
            
            // If length is odd, they can't make equal strings
            if (n % 2 != 0) {
                sb.append("NO\n");
                continue;
            }
            
            // Count frequencies of each character
            int[] freq = new int[26];
            for (int i = 0; i < n; i++) {
                freq[s.charAt(i) - 'a']++;
            }
            
            // Check if all frequencies are even
            boolean possible = true;
            for (int i = 0; i < 26; i++) {
                if (freq[i] % 2 != 0) {
                    possible = false;
                    break;
                }
            }
            
            if (possible) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
    }
}
