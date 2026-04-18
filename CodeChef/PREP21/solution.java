class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            
            Stack<Integer> st = new Stack<>();
            
            for(char c : s.toCharArray()){
                if(Character.isDigit(c)){
                    st.push(c - '0');
                } else {
                    int b = st.pop();
                    int a = st.pop();
                    
                    if(c == '+') st.push(a + b);
                    else if(c == '-') st.push(a - b);
                    else if(c == '*') st.push(a * b);
                }
            }
            
            System.out.println(st.pop());
        }
    }
}