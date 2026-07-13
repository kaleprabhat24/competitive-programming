import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            // Calculate the correct answer
            int correctAns = a - b;
            
            // Check the last digit of the correct answer
            if (correctAns % 10 == 9) {
                // If it ends in 9, subtract 1 to make it 8
                System.out.println(correctAns - 1);
            } else {
                // For any other digit (0-8), add 1 to change it
                System.out.println(correctAns + 1);
            }
        }
        sc.close();
    }
}
