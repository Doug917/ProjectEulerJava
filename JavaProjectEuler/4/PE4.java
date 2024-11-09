public class PE4 {
    
    static boolean isPallindromic(int n){
        
        int numDigits;
        if (n > 99999){
            numDigits = 6;
        }
        else {
            numDigits = 5;
        }
        int[] digits = new int[numDigits];

        for (int i=0;i<numDigits;i++){
            digits[i] = n%10;
            n = (n-digits[i])/10;
        }

        for (int i=0;i<numDigits;i++){
            if (digits[i]!=digits[numDigits-i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int product;
        int largestProduct = 1;
        int n = in.nextInt();
        for (int i=999;i>=100;i--){
            for (int j=999;j>=100;j--){
                product = i*j;
                if (isPallindromic(product) && product < n){
                    if (product > largestProduct){
                        largestProduct = product;
                    }
                }
            }
        }
        System.out.println(largestProduct);

        in.close();
    }
}