package Aula1;

public class vetor {

    public static void main(String[] args) {

        int[] vetor = new int[5];

        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 3;

        // imprimindo individualmente
        System.out.println("vetor " + vetor[0]);

        // imprimindo todos

        for (int i = 0; i < vetor.length; i++) {

            System.out.println("valor na posição " + i + " = " + vetor[i]);
        }
    }

}