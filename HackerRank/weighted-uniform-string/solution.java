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
     * Complete the 'weightedUniformStrings' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER_ARRAY queries
     */

    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        Set<Integer> validWeights = new HashSet<>();
        
        int currentWeight = 0;
        char prevChar = ' ';
        
        // Step 1: Parse the string and record all uniform substring weights
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int charWeight = currentChar - 'a' + 1;
            
            if (currentChar == prevChar) {
                currentWeight += charWeight; // Extend uniform string weight
            } else {
                currentWeight = charWeight;  // Reset for a new character sequence
                prevChar = currentChar;
            }
            
            validWeights.add(currentWeight);
        }
        
        // Step 2: Evaluate each query against our recorded weights
        List<String> answer = new ArrayList<>();
        for (int query : queries) {
            if (validWeights.contains(query)) {
                answer.add("Yes");
            } else {
                answer.add("No");
            }
        }
        
        return answer;
    }

}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<String> result = Result.weightedUniformStrings(s, queries);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
