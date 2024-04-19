import java.util.Scanner;

public class exercicios_13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int i;

        int[] vetorA = new int[30];
        int[] vetorB = new int[30];
        int[] vetorC = new int[30];


        for ( i = 0; i < vetorA.length; i++){
            vetorA[i] = ler.nextInt();
        }
        for ( i = 0; i < vetorB.length; i++){
            vetorB[i] = ler.nextInt();
        }

        System.out.println("este é vetorC");
        for ( i = 0; i < vetorA.length; i++){
            if (vetorA[i] == vetorB[i]) {
                vetorC[i] = vetorA[i];
            } else {}
            System.out.println(vetorC[i]);
        }
    }
}
