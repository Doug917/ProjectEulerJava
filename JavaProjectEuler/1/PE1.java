public class PE1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        m1 = n/3;
        m2 = n/5;
        m3 = n/15;
        
        result = (3*m1*(m1+1)+5*m2*(m2+1)-15*m3*(m3+1))/2;
        
        if (n%3==0 || n%5==0){
            result -= n;
        }
        System.out.println(result);

        in.close();
    }
}