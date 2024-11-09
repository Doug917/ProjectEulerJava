public class PE7 {
    
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
        int n = in.nextInt();
        if (n==1){
            System.out.println(2);
        }
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        primes.add(3);
        while (primes.size() < n){
            primes.add(nextPrime(primes));
        }
        System.out.println(primes.get(primes.size()-1));

        in.close();
    }
}
