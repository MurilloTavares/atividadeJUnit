package model;

public class Fatorial {
    
    public static long calcFatorial(int num) throws ArithmeticException{
        if(num<0){
            throw new ArithmeticException("Valor menor do que zero.");
        }
        
        long result = 1;        
        for(int i = num; i > 0; i--){
            result *= i;
        }        
        return result;
    }
    
}
