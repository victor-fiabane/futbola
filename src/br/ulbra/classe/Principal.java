package br.ulbra.classe;

/**
 *
 * @author 
 */
public class Principal {
    public static void main(String[] args){
        Jogador joog = new Jogador();
        joog.setNome("Joooj");
        joog.setPiosicao("Zagueiro");
        joog.setNacional("Brasileiro");
        joog.setAnoNasc(1999);
        joog.setPeso(90);
        joog.setAltura(1.80);
        System.out.println(joog.toString());
        System.out.println("o jogador tem "
                +joog.calcularIdade()+" anos de idade");
        System.out.println(" o jogador na posição de "
                +joog.getPosicao()+" vai precisar de\n "
        +joog.calcularAposentadoria()+" anos para se aposentar.");
    }
}
