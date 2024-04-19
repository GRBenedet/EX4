public class Exercicios_4 {
    public static void main(String[] args) {
        int i, j = 0, pares = 0;

        int[] vetorF = new int[20];

        for (i = 0; i < vetorF.length; i++){
            vetorF[i] = j + 1;

            if (i %2==0) {
                pares = pares + vetorF[i];
            }

            else {

            }
        }
        System.out.println("Você tem: \n" + pares + " pares");

    }
}
