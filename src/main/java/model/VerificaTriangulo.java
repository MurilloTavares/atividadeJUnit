package model;

public class VerificaTriangulo {
    
    public static boolean isTriangulo(int a, int b, int c){
        return a<b+c && b<a+c && c<a+b;
    }
    
    public static String getTriangulo(int a, int b, int c){
        if(!isTriangulo(a, b, c)){
            return "Não é um triangulo";
        }
        if(a==b && b==c){
            return "Triangulo Equilátero";            
        }
        if(a!=b && b!=c && a!=c){
            return "Triangulo Escaleno";
        }
        return "Triangulo Isóceles";
    }
    
}
