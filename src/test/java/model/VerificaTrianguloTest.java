package model;

import org.junit.Test;
import static org.junit.Assert.*;

public class VerificaTrianguloTest {    
    
    @Test
    public void testTrianguloCT01() {
        System.out.println("triangulo - CT01");
        int a = 5;
        int b = 6;
        int c = 10;
        assertTrue(VerificaTriangulo.isTriangulo(a, b, c));
    }

    @Test
    public void testTrianguloCT02() {
        System.out.println("triangulo - CT02");
        int a = 5;
        int b = 6;
        int c = 20;
        assertFalse(VerificaTriangulo.isTriangulo(a, b, c));
    }
    
    @Test
    public void testTrianguloCT03() {
        System.out.println("triangulo - CT03");
        int a = 5;
        int b = 6;
        int c = 20;
        String expResult = "Não é um triangulo";
        String result = VerificaTriangulo.getTriangulo(a, b, c);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTrianguloCT04() {
        System.out.println("triangulo - CT04");
        int a = 6;
        int b = 6;
        int c = 6;
        String expResult = "Triangulo Equilátero";
        String result = VerificaTriangulo.getTriangulo(a, b, c);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTrianguloCT05() {
        System.out.println("triangulo - CT05");
        int a = 6;
        int b = 6;
        int c = 10;
        String expResult = "Triangulo Isóceles";
        String result = VerificaTriangulo.getTriangulo(a, b, c);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testTrianguloCT06() {
        System.out.println("triangulo - CT06");
        int a = 6;
        int b = 10;
        int c = 6;
        String expResult = "Triangulo Isóceles";
        String result = VerificaTriangulo.getTriangulo(a, b, c);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testTrianguloCT07() {
        System.out.println("triangulo - CT07");
        int a = 10;
        int b = 6;
        int c = 6;
        String expResult = "Triangulo Isóceles";
        String result = VerificaTriangulo.getTriangulo(a, b, c);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testTrianguloCT08() {
        System.out.println("triangulo - CT08");
        int a = 6;
        int b = 7;
        int c = 8;
        String expResult = "Triangulo Escaleno";
        String result = VerificaTriangulo.getTriangulo(a, b, c);
        assertEquals(expResult, result);
    }
    
}
