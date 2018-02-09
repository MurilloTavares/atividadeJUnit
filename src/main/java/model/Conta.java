package model;

public class Conta {
    
    private int numero;
    private String titular;
    private double saldo;
    private double limite_credito;

    public Conta(int numero, String titular, double saldo, double limite_credito) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite_credito = limite_credito;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite_credito() {
        return limite_credito;
    }

    public boolean sacar(double valor){
        if(valor>saldo || valor<0){
            return false;
        }
        saldo -= valor;
        return true;
    }
    
    public boolean depositar(double valor){
        if(valor<0){
            return false;
        }
        saldo += valor;
        return true;
    }
    
    public boolean transferir(Conta c, double valor){
        if(sacar(valor)){
            c.depositar(valor);
            return true;
        }
        return false;
    }

    public boolean comprarNoCredito(double valor){
        if(valor>limite_credito){
            return false;
        }
        return sacar(valor);
    }
    
}
