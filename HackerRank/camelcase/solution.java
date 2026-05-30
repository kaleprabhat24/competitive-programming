import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Read the input string
        if (!in.hasNext()) return;
        String s = in.next();
        
        // Base case: There is always at least 1 word (starts with lowercase)
        int wordCount = 1;
        
        // Loop through the string to find uppercase letters
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Check if character is uppercase
            if (ch >= 'A' && ch <= 'Z') {
                wordCount++;
            }
        }
        
        // Print the total number of words
        System.out.println(wordCount);
        
        in.close();
    }
}
