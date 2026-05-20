import java.io.*;
import java.util.*;

public class Solution {

    public static int surfaceArea(List<List<Integer>> A) {
        int H = A.size();
        int W = A.get(0).size();
        int totalArea = 2 * H * W;
        
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        
        for (int r = 0; r < H; r++) {
            for (int c = 0; c < W; c++) {
                int currentHeight = A.get(r).get(c);
                
                for (int i = 0; i < 4; i++) {
                    int nr = r + dr[i];
                    int nc = c + dc[i];
                    
                    if (nr < 0 || nr >= H || nc < 0 || nc >= W) {
                        totalArea += currentHeight;
                    } else {
                        int neighborHeight = A.get(nr).get(nc);
                        if (currentHeight > neighborHeight) {
                            totalArea += (currentHeight - neighborHeight);
                        }
                    }
                }
            }
        }
        return totalArea;
    }

    // This main method handles the stdin reading and stdout printing for HackerRank
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int H = Integer.parseInt(firstMultipleInput[0]);
        int W = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> A = new ArrayList<>();

        for (int i = 0; i < H; i++) {
            String[] ARowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            List<Integer> ARowItems = new ArrayList<>();

            for (int j = 0; j < W; j++) {
                int AItem = Integer.parseInt(ARowTempItems[j]);
                ARowItems.add(AItem);
            }

            A.add(ARowItems);
        }

        int result = surfaceArea(A);
        System.out.println(result);

        bufferedReader.close();
    }
}
