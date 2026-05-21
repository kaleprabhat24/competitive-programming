import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'absolutePermutation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     */
    public static List<Integer> absolutePermutation(int n, int k) {
        List<Integer> result = new ArrayList<>();
        
        // Case 1: If k is 0, the permutation is 1 to n
        if (k == 0) {
            for (int i = 1; i <= n; i++) {
                result.add(i);
            }
            return result;
        }
        
        // Case 2: Valid configuration is impossible if n is not divisible by 2k
        if (n % (2 * k) != 0) {
            result.add(-1);
            return result;
        }
        
        // Case 3: Swap elements in blocks of size k
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }
        
        for (int i = 1; i <= n; i += 2 * k) {
            for (int j = 0; j < k; j++) {
                int temp = arr[i + j];
                arr[i + j] = arr[i + j + k];
                arr[i + j + k] = temp;
            }
        }
        
        for (int i = 1; i <= n; i++) {
            result.add(arr[i]);
        }
        
        return result;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);
                int k = Integer.parseInt(firstMultipleInput[1]);

                List<Integer> result = Result.absolutePermutation(n, k);

                bufferedWriter.write(
                    result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                    + "\n"
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
