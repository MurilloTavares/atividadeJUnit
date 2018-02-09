package model;

import org.junit.Test;
import static org.junit.Assert.*;

public class CuboTest {

    @Test
    public void testAreaLadoCT01() {
        System.out.println("areaLado - CT01");
        int num = 3;
        int expResult = 9;
        int result = Cubo.areaLado(num);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAreaLadoCT02() {
        System.out.println("areaLado - CT02");
        int num = 1;
        int expResult = 1;
        int result = Cubo.areaLado(num);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAreaLateralCT01() {
        System.out.println("areaLateral - CT01");
        int num = 2;
        int expResult = 16;
        int result = Cubo.areaLateral(num);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAreaLateralCT02() {
        System.out.println("areaLateral - CT02");
        int num = 4;
        int expResult = 64;
        int result = Cubo.areaLateral(num);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAreaTotalCT01() {
        System.out.println("areaTotal - CT01");
        int num = 3;
        int expResult = 54;
        int result = Cubo.areaTotal(num);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAreaTotalCT02() {
        System.out.println("areaTotal - CT02");
        int num = 5;
        int expResult = 150;
        int result = Cubo.areaTotal(num);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVolumeCT01() {
        System.out.println("areaVolume - CT01");
        int num = 2;
        int expResult = 8;
        int result = Cubo.volume(num);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVolumeCT02() {
        System.out.println("areaVolume - CT02");
        int num = 3;
        int expResult = 27;
        int result = Cubo.volume(num);
        assertEquals(expResult, result);
    }
    
}
