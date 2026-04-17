import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        while(t-- > 0){
            String s = sc.nextLine();
            
            int balance = 0;
            boolean valid = true;
            
            for(char c : s.toCharArray()){
                if(c == '('){
                    balance++;
                } else {
                    balance--;
                }
                
                if(balance < 0){
                    valid = false;
                    break;
                }
            }
            