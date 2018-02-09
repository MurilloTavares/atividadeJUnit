package model;

public class Fibonacci {
    
    public static int calcNFibonacci(int n) throws ArithmeticException{
        if(n == 0){
            return 0;
        }
        if(n < 0){
            throw new ArithmeticException("Valor menor do que zero.");
        }
        
        int ant = 0;
        int num = 1;
        int aux;
        
        for(int i = 1; i < n; i++){            
            aux = ant;
            ant = num;
            num += aux;
        }
        
        return num;
    }
    
}
