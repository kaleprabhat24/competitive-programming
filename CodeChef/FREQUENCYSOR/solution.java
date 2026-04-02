    int[] freq = new int[256];

    for (char c : s.toCharArray()) {
        freq[c]++;
    }

    List<Character> chars = new ArrayList<>();
    for (int i = 0; i < 256; i++) {
        if (freq[i] > 0) {
            chars.add((char) i);
        }
    }

    Collections.sort(chars, (a, b) -> {
        if (freq[b] != freq[a]) {
            return freq[b] - freq[a]; // decreasing frequency
        }
        return a - b; // lexicographical order
    });

    StringBuilder result = new StringBuilder();

    for (char c : chars) {
        for (int i = 0; i < freq[c]; i++) {
            result.append(c);
        }
    }

    return result.toString();
}