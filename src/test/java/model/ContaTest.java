package model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContaTest {
    
    Conta conta;
    
    @Before
    public void setUp() {
        conta = new Conta(123, "Joao", 100, 80);
    }

    @Test
    public void testSacarCT01() {
        System.out.println("sacar - CT01");
        assertTrue(conta.sacar(100));
    }
    
    @Test
    public void testSacarCT02() {
        System.out.println("sacar - CT02");
        assertFalse(conta.sacar(1000));
    }
    
    @Test
    public void testSacarCT03() {
        System.out.println("sacar - CT03");
        assertFalse(conta.sacar(-50));
    }
    
    @Test
    public void testDepositarCT01() {
        System.out.println("depositar - CT01");
        assertTrue(conta.depositar(1000));
    }
    
    @Test
    public void testDepositarCT02() {
        System.out.println("depositar - CT02");
        assertFalse(conta.depositar(-50));
    }
    
    @Test
    public void testTransferirCT01() {
        System.out.println("transferir - CT01");
        Conta maria = new Conta(666, "Maria", 0, 500);
        assertTrue(conta.transferir(maria, 100));
    }
    
    @Test
    public void testTransferirCT02() {
        System.out.println("transferir - CT01");
        Conta maria = new Conta(666, "Maria", 0, 500);
        conta.transferir(maria, 100);
        assertTrue(maria.getSaldo()==100 || conta.getSaldo()==0);
    }
    
    @Test
    public void testTransferirCT03() {
        System.out.println("transferir - CT03");
        Conta maria = new Conta(666, "Maria", 0, 500);
        conta.transferir(maria, 9000);
        assertTrue(maria.getSaldo()==0 || conta.getSaldo()==100);
    }
    
    @Test
    public void testTransferirCT04() {
        System.out.println("transferir - CT04");
        Conta maria = new Conta(666, "Maria", 0, 500);
        assertFalse(conta.transferir(maria, -50));
    }
    
    @Test
    public void testTransferirCT05() {
        System.out.println("transferir - CT05");
        Conta maria = null;
        assertFalse(conta.transferir(maria, -50));
    }
    
    @Test
    public void testComprarNoCreditoCT01() {
        System.out.println("comprarNoCredito - CT01");
        assertTrue(conta.comprarNoCredito(80));
    }
    
    @Test
    public void testComprarNoCreditoCT02() {
        System.out.println("comprarNoCredito - CT02");
        assertFalse(conta.comprarNoCredito(90));
    }
    
}
