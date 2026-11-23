import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long pos = 0;
            long neg = 0;
            
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if (val > 0) {
                    pos++;
                } else if (val < 0) {
                    neg++;
                }
            }
            
            long ans = (pos * (pos - 1)) / 2 + (neg * (neg - 1)) / 2;