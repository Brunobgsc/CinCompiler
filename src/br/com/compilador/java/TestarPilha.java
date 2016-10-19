package br.com.compilador.java;

public class TestarPilha {
    
    public static void main(String args[]) {        
        
        
        Pilha p = new Pilha(5);
        
        p.insereToken("B");
        p.insereToken("r");
        p.insereToken("u");
        p.insereToken("n");
        p.insereToken("o");
        
        p.imprimiPilha();
  
    }
}
