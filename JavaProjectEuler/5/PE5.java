public class PE5 {
    
    static int gcd(int a, int b){
        if (a==0){
            return b;
        }
        return gcd(b%a, a);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int result = 1;
        for (int i = 1;i<=n;i++){
            if (result%i != 0){
                result *= i/gcd(result, i);
            }
        }
        System.out.println(result);

        in.close();
    }
}