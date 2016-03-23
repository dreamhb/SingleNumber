public class SingleNumber{

    /**
     * 使用^来判断重复数字，因为^操作符合交换律和结合律
     *所以先将数组中的所有数^，然后将结果和1~ N-1 进行^操作
     *结果就是重复的值
     */
    public int xorSingleNumber(int A[]){
       int result = 0;
       for(int i = 0, n = A.length; i < n ; i++){
            result ^= A[i];
       }

       for(int i = 1, n = A.length; i < n; i++){
            result ^= i;
       }

       return result;
    }

    /**
     * 因为只有一个数字重复，那么将数组中得数求和，
     * 减去1~ N-1的和就是重复的数字
     */
    public int minusSingleNumber(int A[]){
        int sumOrigin = 0;
        int sumA = 0;
        int len = A.length - 1;

        for(int i = 0; i < len; i++){
            sumOrigin += i;
            sumA += A[i];
        }

        int result = sumA + A[len] - (sumOrigin + len);
        return result;
    }

    /**
     * 使用位图法，将数组A中的数，并将位图数组中得对应下标置1，
     * 如果已经为1，则说明重复了
     * 如果数组中的数的最大值超过了数组的长度，那么bitArray得大小必须是
     * 最大值+1
     */
    public int bitmapSingleNumber(int A[]){
        int[] bitArray = new int[A.length + 1];

        for(int i = 0, len = A.length; i < len; i++){
            if(bitArray[A[i]] != 0){
                //found redundent
                return A[i];
            }else{
                bitArray[A[i]] = 1;
            }
        }
        
        return 0;
    }
}
