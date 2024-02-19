package Aula3;

public class Programa {

    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        lista.adicionar("acre");
        lista.adicionar("são paulo");
        lista.adicionar("amapa");

        System.out.println(lista.getTamanho());

        System.out.println("primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("ultimo: " + lista.getUltimo().getValor());

    }

}
