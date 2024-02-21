package Aula3;

public class Programa {

    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        lista.adicionar("acre");
        lista.adicionar("são paulo");
        lista.adicionar("amapa");
        lista.adicionar("minas gerais");

        System.out.println(lista.getTamanho());

        System.out.println("primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("ultimo: " + lista.getUltimo().getValor());
        System.out.println("posição: "+ lista.get(3).getValor());
        
        for(int i=0; i< lista.getTamanho();i++){

            System.out.println(lista.get(i).getValor());
        }

        lista.remover("minas gerais");
        
        for(int i=0; i< lista.getTamanho();i++){

            System.out.println(lista.get(i).getValor());
        }
    }

}
