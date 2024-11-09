import java.util.*;

public class PE35 {
    
    static boolean isCyclic(int n, ArrayList<Integer> primes){
        
        //calculate number of digits.
        int m = n;
        int numDigits = 0;
        while (m>0){
            if (m%10==0){return false;} //number cannot contain any zero-digit.
            m = (m-m%10)/10;
            numDigits += 1;
        }

        // Now, we know number has no 0-digits.  We also know the
        // number of digits.

        //Compute cyclic permutation and see if in primes list.
        //Continue permuting and testing until we have tested all
        //cyclic permutations.  If all are prime, we return true.
        m = n;
        if (! primes.contains(m)){return false;}
        //cyclic permutation:
        m = (m % 10)*(int)Math.pow(10,numDigits-1) + (m - m%10)/10;
        while (m != n){
            if (! primes.contains(m)){
                return false;
            }
            m = (m % 10)*(int)Math.pow(10,numDigits-1) + (m - m%10)/10;
        }

        return true;
        
    }
    
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
        
        //Create list of primes < 1,000,000.
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        primes.add(3);
        while (primes.get(primes.size()-1) < 999999){
            primes.add(nextPrime(primes));
        }

        //Now, count the cyclic primes.
        int result = 0;
        for (int p:primes){
            if (isCyclic(p, primes)){
                result += 1;
            }
        }

        System.out.println(result);
        
    }
}











