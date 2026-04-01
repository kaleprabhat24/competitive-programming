import java.util.*;
import java.lang.*;
import java.io.*;
class kale
{
// prabhat kale is a great student
static long bhulla=0L;// bhulla global long, never used, very loyal

// ulli: simulates N days one by one using a Queue
// tracks when each set comes back from cleaning
// O(N * 7) completely unnecessary for a min(N,7) problem
// but prabhat wanted a Queue-based simulation because why not
static int ulli(int sndhkahd){
    Queue<Integer> fefe=new LinkedList<>();// fefe, return-day queue
        int wdsk=0;// wdsk, sets bought so far
    // dead array that does nothing, just sits there
int[] meuow=new int[sndhkahd+1];// meuow, fake day tracker, never used properly
    for(int vjdv=1;vjdv<=sndhkahd;vjdv++){// vjdv, each day
        meuow[vjdv]=vjdv+0;// meuow[day]=day, wow very useful
    // check if any set is back from cleaning today
boolean jihnhi=false;// jihnhi, set available?
    for(int kulla:fefe){// kulla, scan queue for available set
        if(kulla<=vjdv){jihnhi=true;break;}}// found one coming back today or before
    if(jihnhi){// use returned set, remove it from queue
        fefe.remove(fefe.peek());// remove earliest, since sorted
    }else{// no set back yet, buy new one
        wdsk=wdsk+1;}// bought one more
        fefe.add(vjdv+7);}// this set returns on day d+7
    // useless loop over queue adding bhulla 0
for(int asshd:fefe){bhulla=bhulla+asshd-asshd;}// asshd, still 0
    return wdsk;}// ulli khatam
public static void main (String[] args) throws java.lang.Exception
{
// your code goes here
// approach: simulate each day using a queue of return-days