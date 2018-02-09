package model;

import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void testCalcNFibonacciCT01() {
        System.out.println("calcNFibonacci = CT01");
        int n = 2;
        int expResult = 1;
        int result = Fibonacci.calcNFibonacci(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcNFibonacciCT02() {
        System.out.println("calcNFibonacci = CT02");
        int n = 10;
        int expResult = 55;
        int result = Fibonacci.calcNFibonacci(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalcNFibonacciCT03() {
        System.out.println("calcNFibonacci = CT03");
        int n = 11;
        int expResult = 89;
        int result = Fibonacci.calcNFibonacci(n);
        assertEquals(expResult, result);
    }
    
}
