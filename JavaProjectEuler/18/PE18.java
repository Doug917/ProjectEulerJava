class PE18{

    static int pathSum(String s, int[][] A){

        int[] binRepi = new int[14];

        int i=0;
        for (char c:s.toCharArray()){
            binRepi[i] = Character.getNumericValue(c);
            i+=1;
        }
    
        int pathvalue = 75;
        int prevIndex = 0;
        for (i=0;i<binRepi.length;i++){
            pathvalue += A[i][prevIndex+binRepi[i]];
            prevIndex += binRepi[i];
        }
        return pathvalue;
    }

    public static void main(String[] args){

        int[][] A = new int[14][];

        A[0] = new int[] {95,64};
        A[1] = new int[] {17,47,82};
        A[2] = new int[] {18,35,87,10};
        A[3] = new int[] {20,4,82,47,65};
        A[4] = new int[] {19,1,23,75,3,34};
        A[5] = new int[] {88,2,77,73,7,63,67};
        A[6] = new int[] {99,65,4,28,6,16,70,92};
        A[7] = new int[] {41,41,26,56,83,40,80,70,33};
        A[8] = new int[] {41,48,72,33,47,32,37,16,94,29};
        A[9] = new int[] {53,71,44,65,25,43,91,52,97,51,14};
        A[10] = new int[] {70,11,33,28,77,73,17,78,39,68,17,57};
        A[11] = new int[] {91,71,52,38,17,14,91,43,58,50,27,29,48};
        A[12] = new int[] {63,66,4,68,89,53,67,30,73,16,69,87,40,31};
        A[13] = new int[] {4,62,98,27,23,9,70,98,73,93,38,53,60,4,23};

        //Loop through all paths.
        String binRep;
        
        int result = 0;
        for (int i=0;i<16384;i++){
            binRep = Integer.toBinaryString(i);
            result = Math.max(result, pathSum(binRep, A));
        }

        System.out.println(result);

    }
}