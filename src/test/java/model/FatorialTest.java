package model;

import org.junit.Test;
import static org.junit.Assert.*;

public class FatorialTest {

    @Test
    public void testCalcFatorialCT01() {
        System.out.println("calcFatorial - CT01");
        int num = 5;
        long expResult = 120L;
        long result = Fatorial.calcFatorial(num);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcFatorialCT02() {
        System.out.println("calcFatorial - CT02");
        int num = 10;
        long expResult = 3628800L;
        long result = Fatorial.calcFatorial(num);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcFatorialCT03() {
        System.out.println("calcFatorial - CT03");
        int num = 20;
        long expResult = 2432902008176640000L;
        long result = Fatorial.calcFatorial(num);
        assertEquals(expResult, result);
    }
    
}
