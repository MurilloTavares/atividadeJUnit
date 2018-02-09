package model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AviaoTest {
        
    int potencia = 500;
    Aviao aviao  = new Aviao(potencia);

    @Before
    public void setUp() {
        aviao.pousar();
        aviao.setVelocidade(0);
        aviao.desligar();
    }
    
    //Ligar
    @Test
    public void testLigar() {
        System.out.println("ligar");
        aviao.ligar();
        assertTrue(aviao.isLigado());
    }
    
    //Voar depois de ligar e acelerar
    @Test
    public void testVoarCT01() {
        System.out.println("voar - CT01");
        aviao.ligar();
        aviao.acelerar(100);
        aviao.voar();
        assertTrue(aviao.isVoando());
    }
    
    //Voar com aviao parado
    @Test
    public void testVoarCT02() {
        System.out.println("voar - CT02");
        aviao.ligar();
        aviao.voar();
        assertFalse(aviao.isVoando());
    }
    
    //Voar com aviao desligado
    @Test
    public void testVoarCT03() {
        System.out.println("voar - CT03");
        aviao.acelerar(100);
        aviao.voar();
        assertFalse(aviao.isVoando());
    }
    
    //Desligar
    @Test
    public void testDesligarCT01() {
        System.out.println("desligar - CT01");
        aviao.desligar();
        assertFalse(aviao.isLigado());
    }
    
    //Desligar com aviao voando
    @Test
    public void testDesligarCT02() {
        System.out.println("desligar - CT02");
        aviao.ligar();
        aviao.acelerar(100);
        aviao.voar();
        aviao.desligar();
        assertTrue(aviao.isLigado());
    }
    
    //Desligar com aviao em movimento
    @Test
    public void testDesligarCT03() {
        System.out.println("desligar - CT03");
        aviao.ligar();
        aviao.acelerar(100);
        aviao.desligar();
        assertTrue(aviao.isLigado());
    }
    
    //Acelerar com aviao ligado
    @Test
    public void testAcelerarCT01() {
        System.out.println("acelerar - CT01");
        int vel = 100;
        aviao.ligar();
        aviao.acelerar(vel);
        int expResult = 100;
        int result = aviao.getVelocidade();
        assertEquals(expResult, result);        
    }
    
    //Acelerar com aviao ligado e velocidade acima do limite
    @Test
    public void testAcelerarCT02() {
        System.out.println("acelerar - CT02");
        int vel = 1000;
        aviao.ligar();
        aviao.acelerar(vel);
        int expResult = aviao.getPotencia();
        int result = aviao.getVelocidade();
        assertEquals(expResult, result);        
    }

    //Acelerar com aviao ligado e velocidade < 0
    @Test
    public void testAcelerarCT03() {
        System.out.println("acelerar - CT03");
        int velInval = -100;
        aviao.ligar();
        aviao.acelerar(100);
        int expResult = aviao.getVelocidade();
        aviao.acelerar(velInval);        
        int result = aviao.getVelocidade();
        assertEquals(expResult, result);        
    }
    
    //Acelerar com aviao desligado
    @Test
    public void testAcelerarCT04() {
        System.out.println("acelerar - CT04");
        int vel = 100;
        aviao.acelerar(vel);
        int expResult = 0;
        int result = aviao.getVelocidade();
        assertEquals(expResult, result);        
    }
    
    //Desacelerar com aviao voando
    @Test
    public void testDesacelerarCT01() {
        System.out.println("desacelerar - CT01");
        aviao.ligar();
        aviao.acelerar(100);
        aviao.voar();
        aviao.desacelerar(50);
        int expResult = 50;
        int result = aviao.getVelocidade();
        assertEquals(expResult, result);
    }
    
    //Desacelerar ate 0 com aviao voando
    @Test
    public void testDesacelerarCT02() {
        System.out.println("desacelerar - CT02");
        aviao.ligar();
        aviao.acelerar(100);
        aviao.voar();
        aviao.desacelerar(100);
        assertFalse(aviao.isVoando());
    }

    //Desacelerar abaixo do limite com aviao no solo
    @Test
    public void testDesacelerarCT03() {
        System.out.println("desacelerar - CT03");
        aviao.ligar();
        aviao.acelerar(100);
        aviao.desacelerar(100);
        int expResult = 0;
        int result = aviao.getVelocidade();
        assertEquals(expResult, result);
    }

    //Pousar
    @Test
    public void testPousarCT01() {
        System.out.println("pousar - CT01");
        aviao.ligar();
        aviao.acelerar(100);
        aviao.voar();
        aviao.pousar();
        assertFalse(aviao.isVoando());
    }
    
}
