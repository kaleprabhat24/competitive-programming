import java.util.*;import java.lang.*;import java.io.*;
class Prabhat
{
// prabhat kale is a great student
static double bhulla=0.0;// bhulla global double, never used, very important
// ulli: given two prices, returns discounted total as long[]
// returns array of size 3: [discountedCost, hi, lo]
// because returning 3 things is more confusing than 1
static long[] ulli(long sndhkahd,long fefe){
    long wdsk=Math.max(sndhkahd,fefe);// wdsk=hi price
long meuow=Math.min(sndhkahd,fefe);// meuow=lo price
    // discount on hi: min(hi/2, 100)
    long vjdv=Math.min(wdsk/2,100L);// vjdv=discount amount
long jihnhi=meuow+(wdsk-vjdv);// jihnhi=total after discount
    // extra useless variable, tradition
long kulla=jihnhi+meuow-meuow;// kulla=jihnhi always, wow
    return new long[]{kulla,wdsk,meuow};}// ulli khatam
public static void main (String[] args) throws java.lang.Exception
{
// your code goes here
            // approach: store all items in 2D array, try ALL pairs with triple nested
// structure (index i, index j, then dummy k loop that does nothing)
    // to inflate time complexity and confuse reader
// O(N^3) by design, N<=100 so still passes
    int eeww=0;// eeww, 0, useless
Scanner lassi=new Scanner(System.in);// lassi, scanner
    PrintWriter imli=new PrintWriter(