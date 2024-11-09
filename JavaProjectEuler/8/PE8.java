public class PE8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int k = in.nextInt();
        String num = in.next();
        // Create an array of the digits of num.
        int[] numArr = new int[n];
        for (int i=0;i<num.length();i++){
            numArr[i] = Integer.parseInt(num.substring(i,i+1));
        }
        int largestProduct = 0;
        int start = 0;
        int currProduct;
        while (start < n-k){
            currProduct = 1;
            for (int j=0;j<k;j++){
                currProduct *= numArr[start+j];
            }
            largestProduct = Math.max(largestProduct,currProduct);
            start += 1;
        }
        System.out.println(largestProduct);

        in.close();
    }
}