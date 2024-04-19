import java.util.Scanner;

public class Exercicios_10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i, num, j;

        int[] vetorPar = new int[10];
        int[] vetorImpar = new int[10];

        System.out.println("digite 10 numeros inteiros: ");
        for (i = 0; i < vetorPar.length; i++){
            num = ler.nextInt();

            if (num % 2 == 0 && num != 0) {
                vetorPar[i] = num;
            }

            else if (num == 0) {
                i = 10;
            }

            else {
                vetorImpar[i] = num;
            }
        }
        System.out.println("-----VETOR PAR-----");
        for (i = 0; i < vetorPar.length; i++){
            System.out.println(vetorPar[i]);
        }
        System.out.println("-----VETOR IMPAR-----");
        for (i = 0; i < vetorImpar.length; i++){
            System.out.println(vetorImpar[i]);
        }
    }
}
