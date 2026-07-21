import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'maximumPerimeterTriangle' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY sticks as parameter.
     */
    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        // Sort the sticks in ascending order
        Collections.sort(sticks);
        
        // Iterate backward to find the triplet with the maximum perimeter first
        for (int i = sticks.size() - 3; i >= 0; i--) {
            int a = sticks.get(i);
            int b = sticks.get(i + 1);
            int c = sticks.get(i + 2);
            
            // Check the non-degenerate triangle condition
            if (a + b > c) {
                return Arrays.asList(a, b, c);
            }
        }
        
        // If no valid triangle is found, return -1
        return Arrays.asList(-1);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> sticks = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.maximumPerimeterTriangle(sticks);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" ")) + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
