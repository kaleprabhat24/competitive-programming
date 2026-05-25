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
     * Complete the 'almostSorted' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static void almostSorted(List<Integer> arr) {
        int n = arr.size();
        
        // 1. Create a sorted copy of the original array
        List<Integer> sortedArr = new ArrayList<>(arr);
        Collections.sort(sortedArr);
        
        // 2. Identify all indices where the original and sorted arrays mismatch
        List<Integer> diffIndices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!arr.get(i).equals(sortedArr.get(i))) {
                diffIndices.add(i);
            }
        }
        
        // Case 1: Array is already sorted
        if (diffIndices.isEmpty()) {
            System.out.println("yes");
            return;
        }
        
        // Case 2: Check if a single SWAP works
        if (diffIndices.size() == 2) {
            int l = diffIndices.get(0);
            int r = diffIndices.get(1);
            
            if (arr.get(l).equals(sortedArr.get(r)) && arr.get(r).equals(sortedArr.get(l))) {
                System.out.println("yes");
                System.out.println("swap " + (l + 1) + " " + (r + 1));
                return;
            }
        }
        
        // Case 3: Check if a single REVERSE works
        int l = diffIndices.get(0);
        int r = diffIndices.get(diffIndices.size() - 1);
        
        boolean canReverse = true;
        for (int i = l; i <= r; i++) {
            if (!arr.get(i).equals(sortedArr.get(r - (i - l)))) {
                canReverse = false;
                break;
            }
        }
        
        if (canReverse) {
            System.out.println("yes");
            System.out.println("reverse " + (l + 1) + " " + (r + 1));
            return;
        }
        
        // Case 4: Cannot be sorted with one operation
        System.out.println("no");
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.almostSorted(arr);

        bufferedReader.close();
    }
}
