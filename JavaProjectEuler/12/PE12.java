public class PE12 {
    
    static int numDivisors(int n){
        
        if (n==1){
            return 1;
        }
        int result = 2;
        int icopy = 1;
        for (int i=2;i*i<n;i++){
            icopy = i;
            if (n%i == 0){
                result += 2;
            }
        }
        if (icopy*icopy == n){
            result += 1;
        }
        
        return result;
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = sc.nextInt();
        int triang_number = 1;
        int counter = 1;
        while (numDivisors(triang_number)<=n){
            counter += 1;
            triang_number += counter;
        }
        System.out.println(triang_number);

        in.close();
    }
}
