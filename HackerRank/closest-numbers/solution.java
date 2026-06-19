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
     * Complete the 'closestNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> closestNumbers(List<Integer> arr) {
        // Step 1: Sort the list to place closer numbers next to each other
        Collections.sort(arr);
        
        List<Integer> result = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        
        // Step 2: Single pass to find the absolute minimum difference
        for (int i = 0; i < arr.size() - 1; i++) {
            int currentDiff = arr.get(i + 1) - arr.get(i);
            
            if (currentDiff < minDiff) {
                // Found a smaller difference: update minimum and clear previous pairings
                minDiff = currentDiff;
                result.clear();
                result.add(arr.get(i));
                result.add(arr.get(i + 1));
            } else if (currentDiff == minDiff) {
                // Matches the current minimum difference: add pair to the list
                result.add(arr.get(i));
                result.add(arr.get(i + 1));
            }
        }
        
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.closestNumbers(arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
