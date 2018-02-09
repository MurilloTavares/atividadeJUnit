package model;

public class Cubo {
    
    public static int areaLado(int a) throws ArithmeticException{
        if(a < 0){
            throw new ArithmeticException("Valor inválido");
        }
        return a*a;
    }
    
    public static int areaLateral(int a) throws ArithmeticException{
        if(a < 0){
            throw new ArithmeticException("Valor inválido");
        }
        return 4*a*a;
    }
    
    public static int areaTotal(int a) throws ArithmeticException{
        if(a < 0){
            throw new ArithmeticException("Valor inválido");
        }
        return 6*a*a;
    }
    
    public static int volume(int a) throws ArithmeticException{
        if(a < 0){
            throw new ArithmeticException("Valor inválido");
        }
        return a*a*a;
    }
    
}
