public class PE2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        long n = in.nextLong();
        long mprev = 1,mcurr = 2;
        long result = 0,temp;
    
        while (mcurr <= n){
            if (mcurr % 2 == 0){
                result += mcurr;
            }
            temp = mcurr;
            mcurr = mcurr + mprev;
            mprev = temp;
        }
        System.out.println(result);

        in.close();
    }
}