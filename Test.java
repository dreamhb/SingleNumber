public class Test{
    public static void main(String[] args){
        SingleNumber sn = new SingleNumber();
        int[] x = { 2, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 5};
        int result = sn.xorSingleNumber(x);
        System.out.println("same result =" + result);
        int mResult = sn.minusSingleNumber(x);
        System.out.println(" minus result == " + mResult);
        int bitmapResult = sn.bitmapSingleNumber(x);
        System.out.println(" bitmap result == " + bitmapResult);
    }
}
