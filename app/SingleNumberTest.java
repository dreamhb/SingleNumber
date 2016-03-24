import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SingleNumberTest{
    
    @Test
    public void evaluteExpression(){
        SingleNumber sn = new SingleNumber();
        int[] x = {2, 1, 3, 5, 4, 6, 7, 9, 8, 10, 6, 11};
        assertEquals(6, sn.xorSingleNumber(x));
        assertEquals(6, sn.minusSingleNumber(x));
        assertEquals(6, sn.bitmapSingleNumber(x));
    }
}
