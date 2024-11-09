public class PE3 {
    
    static int nextPrime(ArrayList<Integer> primes){
        
        int newp = primes.get(primes.size()-1)+2;
        int q=1;
        while (true) {
            for (int p:primes){
                q = p;
                if (newp % p == 0 || p*p > newp){
                    break;
                }
            }
            if (q*q > newp){
                return newp;
            }
            newp += 2;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        long n = in.nextLong();
        int lastIndex;
        ArrayList<Integer> plist = new ArrayList<Integer>();
        plist.add(2);
        plist.add(3);
        while (plist.size() <= Math.sqrt(n)){
            plist.add(nextPrime(plist));
        }
        lastIndex = plist.size() - 1;//Now, check for divisibility.
        while (n % plist.get(lastIndex) !=0){
            lastIndex -= 1;
            if (lastIndex == -1){
                break;
            }
        }
        if (lastIndex == -1){
            System.out.println(n);
        }
        else{
            System.out.println(plist.get(lastIndex));
        }

        in.close();
    }
}