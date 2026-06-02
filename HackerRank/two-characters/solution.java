import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        
        int maxPatternLength = 0;
        
        // Edge case: if length is 1, a valid 2-character alternating pattern is impossible
        if (len <= 1) {
            System.out.println(0);
            return;
        }
        
        // Iterate through all possible lowercase letter combinations (26 * 25 / 2 = 325 pairs)
        for (int i = 0; i < 26; i++) {
            nextPair:
            for (int j = i + 1; j < 26; j++) {
                char charOne = (char) ('a' + i);
                char charTwo = (char) ('a' + j);
                
                char lastSeen = '\u0000'; // Null character sentinel
                int currentLength = 0;
                
                // Traverse the string checking only our target pair
                for (int k = 0; k < len; k++) {
                    char currentLetter = s.charAt(k);
                    
                    if (currentLetter == charOne || currentLetter == charTwo) {
                        // If the same character appears consecutively, this pair fails
                        if (currentLetter == lastSeen) {
                            continue nextPair; 
                        }
                        
                        currentLength++;
                        lastSeen = currentLetter;
                    }
                }
                
                // Maintain the maximum length found among valid pairs
                if (currentLength > maxPatternLength) {
                    maxPatternLength = currentLength;
                }
            }
        }
        
        System.out.println(maxPatternLength);
        in.close();
    }
}
