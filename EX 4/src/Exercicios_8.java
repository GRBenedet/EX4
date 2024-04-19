import java.util.Scanner;

public class Exercicios_8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i;
        int [] vetorM = new int[10];
        int [] vetorMod = new int[10];

        for (i = 0; i < vetorM.length; i++){
            System.out.println("defina elemento");
            vetorM[i] = ler.nextInt();
        }

        
        System.out.println("Este é o vetor modificado:");
        for ( i = 0; i < vetorM.length / 2; i++) {
            vetorMod[i] = vetorM[i + 5];
            System.out.println(vetorMod[i]);
        }
        for (i = 0; i < vetorMod.length; i++) {
            vetorMod[i+5] = vetorM[i];
            System.out.println(vetorMod[i+5]);
        }
    }
}
