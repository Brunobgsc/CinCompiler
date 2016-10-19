package br.com.compilador.java;

public class Pilha {

    public String[] token;
    public int topoPilha;
    InterfaceCompiler ic = new InterfaceCompiler();

    public Pilha(int tamPilha) {
        this.token = new String[tamPilha];
        this.topoPilha = -1;

    }

    public void insereToken(String simbolos) {
        if (topoPilha == token.length - 1) {
            System.out.println("A PILHA ESTA CHEIA"); //Pilha cheia
        } else {
            topoPilha++;
            token[topoPilha] = simbolos;
        }

    }

    public void removeToken() {

        if (topoPilha < 0) {
            System.out.println("A PILHA ESTA VAZIA");
        } else {
            token[topoPilha] = null;
            --topoPilha;
        }

    }

    public void imprimiPilha() {

        for (int x = 0; x < token.length; x++) {
            System.out.println("Item" + "[" + (x + 1) + "]" + token[x]);
        }
        System.out.println("\nTamanho da Pilha = " + token.length + "\nTopo da Pilha = " + (topoPilha + 1));
    }

    public void pesquisaPilha(String nome) {

        for (int x = 0; x < token.length; x++) {
            if (token[x].equals(nome)) {
           
                System.out.println("Encontrado: Item [" + (x + 1) + "] = " + token[x]);
        }
      }
    }
  }
