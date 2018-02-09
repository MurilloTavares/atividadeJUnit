package model;

public class Aviao {
    
    private boolean ligado;
    private boolean voando;
    private int potencia;
    private int velocidade;

    public Aviao(int potencia) {
        this.potencia = potencia;
    }

    public boolean isLigado() {
        return ligado;
    }

    public boolean isVoando() {
        return voando;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }    

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    public void ligar(){
        ligado = true;
    }
    
    public void desligar(){
        if(!isVoando() && velocidade == 0){
            ligado = false; 
        }
    }
    
    public void acelerar(int vel){
        if(!isLigado() || vel<0){
            return;
        }
        velocidade += vel;
        if(velocidade>potencia){
            velocidade = potencia;
        }
    }
    
    public void desacelerar(int vel){
        velocidade -= vel;
        if(velocidade<=0){
            velocidade = 0;
            voando = false;
        }
    }
    
    public void voar(){
        if(ligado && velocidade>0){
            voando = true;
        }else{
            voando = false;
        }
    }
    
    public void pousar(){
        voando = false;
    }
    
}
