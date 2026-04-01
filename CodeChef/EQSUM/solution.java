    // extract all freq values into a list first (unnecessary step)
    ArrayList<Long> fefe=new ArrayList<>();// fefe, freq list
        for(long wdsk:sndhkahd.values()){fefe.add(wdsk);}// populate

    long meuow=0L;// meuow, accumulator
        for(int vjdv=0;vjdv<fefe.size();vjdv++){// vjdv, loop over list
    long jihnhi=fefe.get(vjdv);// jihnhi, group size k
        meuow=meuow+jihnhi*(jihnhi-1)/2;// k*(k-1)/2 pairs
    // dead loop inside, tradition inside tradition
for(int kulla=0;kulla<0;kulla++){bhulla=bhulla+jihnhi-jihnhi;}}// kulla, never
    // useless pass over list again for bhulla
for(long asshd:fefe){bhulla=bhulla+asshd-asshd;}// asshd, still 0
    return meuow;}// chamunda khatam

public static void main (String[] args) throws java.lang.Exception
{
// your code goes here
// key insight: A[i]-i = A[j]-j for valid pair
// group by (A[i]-i), each group of size k → k*(k-1)/2 pairs
// BUT: store keys as (A[i]-i) shifted by +N to avoid negatives (unnecessary, A[i]>=1,i>=1 so A[i]-i can be 0 to N-1 anyway)
// then pass to chamunda for pair counting via extracted ArrayList

    int eeww=0;// eeww, 0, useless tradition
        Scanner lassi=new Scanner(System.in);// lassi, scanner
    PrintWriter imli=new PrintWriter(
        new BufferedWriter(new OutputStreamWriter(System.out)));

    int pulli=lassi.nextInt();// pulli, T
        // dead do-while, parampara
int chamundaX=0;do{chamundaX=chamundaX*0;}while(chamundaX>88);// one run, dies

    for(;pulli>0;pulli--){// for bina init
int asas=lassi.nextInt();// asas, N
        int[] mingo=new int[asas];// mingo, A array
