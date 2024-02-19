package Aula2;

import java.util.Scanner;

public class Str_BuscaLinear {

    public static void main(String[] args) {

        String[] estados = new String[4];

        estados[0] = "SP";
        estados[1] = "SC";
        estados[2] = "BA";
        estados[3] = "RJ";

        // impressão

        for (int i = 0; i < estados.length; i++) {

            System.out.println("estado " + i + " = " + estados[i]);
        }

        // Busca

        @SuppressWarnings("resource")
        Scanner Leitor = new Scanner(System.in);
        System.out.println(Leitor);

        System.out.println("Qual sigla de estado voce quer buscar: ");
        String Busca = Leitor.nextLine().toUpperCase();

        // busca linear
        boolean encontrou = false;

        for (int i = 0; i < estados.length; i++) {

            String Elemento = estados[i];

            if (Elemento.equals(Busca)) {
                encontrou = true;
                break;
            }

        }
        if (encontrou == true) {
            System.out.println("Estado encontrado");
        } else {
            System.out.println("Estado nao econtrado");
        }

    }

}