import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        // Track the presence of each of the 26 lowercase English alphabet letters
        boolean[] alphabetSeen = new boolean[26];
        int uniqueCount = 0;

        // Iterate through each character of the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Convert uppercase characters to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            // If it's a valid lowercase letter and we haven't recorded it yet
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                if (!alphabetSeen[index]) {
                    alphabetSeen[index] = true;
                    uniqueCount++;
                    
                    // Optimization: If we found all 26 letters, we can exit early
                    if (uniqueCount == 26) {
                        return "pangram";
                    }
                }
            }
        }

        // Return the correct tag based on the alphabet checklist completion
        return uniqueCount == 26 ? "pangram" : "not pangram";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
