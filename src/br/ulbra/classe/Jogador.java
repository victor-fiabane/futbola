package br.ulbra.classe;

import java.util.Calendar;

/**
 *
 * @author 
 */
public class Jogador {
    private String nome;
    private String posicao;
    private int anoNasc;
    private String nacional;
    private double altura;
    private double peso;
    
    public Jogador(){
        
    }
    /*get não possui intrução porém a variavel é declarada antes do parenteses,
    set possui já que é colocado void*/ 
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getPosicao(){
        return posicao;
    }
    public void setPiosicao(String posicao){
        this.posicao = posicao;
    }
    public int getAnoNasc(){
        return anoNasc;
    }
    public void setAnoNasc(int anoNasc){
        this.anoNasc = anoNasc;
    }
    public String getNacional(){
        return nacional;
    }
    public void setNacional(String nacional){
        this.nacional = nacional;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public String toString(){
        return "Nome: "+this.nome+
                "\n Posição: "+this.posicao+
                "\nAno de Nascimento: "+this.anoNasc+
                "\nNacionalidade: "+this.nacional+
                "\nAltura: "+this.altura+
                "\nPeso: "+this.peso;
    }
    /*toString é mais "Chique" de se usar
    (Mostra a coleta de dados da classe em questão)
    é mais facil reconhecer um toString do que um Joption ou Sout*/
    
    public int calcularIdade(){
        Calendar cal = Calendar.getInstance();
        int ano;
        ano = cal.get(Calendar.YEAR);
        return (ano - anoNasc);//Retorna a idade
    }
    public int calcularAposentadoria(){
        int tempoAposentar = 0;
        int idade =  calcularIdade();
        if(getPosicao().equals("Zagueiro")){
            tempoAposentar = 40 - idade;
    }else if (getPosicao().equals("Meio-Campo")){
        tempoAposentar = 38 - idade;
    }else{
        tempoAposentar = 35 - idade;
    }
        return tempoAposentar;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
