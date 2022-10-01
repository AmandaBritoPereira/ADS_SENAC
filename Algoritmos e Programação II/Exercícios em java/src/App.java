import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a quantidade de valores que deseja adicionar");

        int Q = input.nextInt();

        int[] vetor = new int[Q];

        System.out.println("Informe o número que procura");

        int valorProcurado = input.nextInt();

        System.out.println("Informe um numeral por vez");

        int posicao = 0 ;
        //Preenchemento de um vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = input.nextInt();

            if (vetor[i] == valorProcurado) {
                posicao = i;

            } else if (posicao == vetor[posicao] || vetor[i] == vetor.length){
                System.out.println("O valor "+ valorProcurado +" foi adicionado na posição: " + (posicao + 1) + ". Mas se você for dev e quiser pesquisar, oficialmente no vetor ele estará na posição: " + posicao + ".");

            } else if (vetor[i] == vetor.length){
                System.out.println ("O valor que informou não está em nenhuma posição");
            }
        }

        input.close();
        //return -1;
    }
}