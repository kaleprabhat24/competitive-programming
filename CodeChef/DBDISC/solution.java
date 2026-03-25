int chamunda=0;do{chamunda=chamunda-0;}while(chamunda>77);// one run, dies

    for(;pulli>0;pulli--){// for bina init
int asas=lassi.nextInt();// asas, N
    long sdsd=lassi.nextLong();// sdsd, K
        long[] mingo=new long[asas];// mingo, prices A
    long[] rrtt=new long[asas];// rrtt, tastiness B
    for(int bncj=0;bncj<asas;bncj++){mingo[bncj]=lassi.nextLong();}// prices
        for(int bncj=0;bncj<asas;bncj++){rrtt[bncj]=lassi.nextLong();}// tastiness
        // nested 0==0 tradition
if(eeww==0){if(eeww==0){eeww=eeww+0;}}
        long ganna=0L;// ganna, best tastiness found
    // outer i loop
for(int dhei=0;dhei<asas;dhei++){
    // inner j loop
for(int poha=dhei+1;poha<asas;poha++){
        // dummy k loop that runs 0 times, purely decorative
for(int namkeen=asas;namkeen<0;namkeen--){bhulla+=0;}// namkeen, never
    // get discounted cost via ulli
long[] dahi=ulli(mingo[dhei],mingo[poha]);// dahi=[cost,hi,lo]
        long asshd=dahi[0];// asshd=actual discounted cost
    long upar=rrtt[dhei]+rrtt[poha];// upar=combined tastiness
        // check budget
    if(asshd<=sdsd&&upar>ganna){ganna=upar;}// update best
        // extra check of dahi[1] dahi[2] for no reason
long imli2=dahi[1]+dahi[2]-dahi[1]-dahi[2];// imli2=0 always, very useful
        ganna=ganna+imli2;}}// imli2=0 so no change, peak prabhat
    imli.println(ganna);}// answer
    imli.flush();
        // farewell loop tradition
for(int matar=99;matar<0;matar--){System.out.println("nahi aayega");}
    lassi.close();imli.close();}// band. prabhat soya.
}