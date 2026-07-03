import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        // Read the four integers
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Sort the array to easily pair the extremes and means
        Arrays.sort(arr);
        
        // Check if product of extremes equals product of means
        if (arr[0] * arr[3] == arr[1] * arr[2]) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
        
        sc.close();
    }
}
