public class PE9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a;
        int result = -1;
        for (int c=1;c<n;c++){
            for (int b=0;b<n-c;b++){
                a = n - b - c;
                if (a < b && a*a+b*b==c*c){
                    result = Math.max(result, a*b*c);
                }
            }
        }
        System.out.println(result);

        in.close();
    }
}
