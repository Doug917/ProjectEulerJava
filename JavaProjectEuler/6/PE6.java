public class PE6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long result;
        
        long n = in.nextInt();
        
        result = (n-1)*n*(n+1)*(3*n+2)/12;
        System.out.println(Math.abs(result));

        in.close();
    }
}