import java.util.Scanner;

public class Exercicios_9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i, j;
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[vetorA.length + vetorB.length];
        
        for (i = 0; i < vetorA.length; i++){
            System.out.println("defina elemento de A:");
            vetorA[i] = ler.nextInt();
            System.out.println("defina elemento de B:");
            vetorB[i] = ler.nextInt();
        }

        for (j = 0, i = 0; i < vetorC.length; i++){
            if (i < vetorA.length) {
                vetorC[i] = vetorA[i];
            }
            else {
                vetorC[i] = vetorB[j];
                j++;
            }
        }

        System.out.println("elementos de A:");
        for (i = 0; i < vetorA.length; i++){
            System.out.println(vetorA[i]);
        }

        System.out.println("elementos de B:");
        for (i = 0; i < vetorA.length; i++){
            System.out.println(vetorB[i]);
        }

        System.out.println("elementos de C:");
        for (i = 0; i < vetorC.length; i++){
            System.out.println(vetorC[i]);
        }
    }
}
