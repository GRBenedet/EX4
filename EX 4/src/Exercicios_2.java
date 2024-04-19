public class Exercicios_2 {
    public static void main(String[] args) {

        int i, j = 10;
        int[] vetorX = new int[10];

        for (i = 0; i < vetorX.length; i++) {
            vetorX[i] = j;
            j = j + 10;
        }
        System.out.println("este é o seu vetor");
        for (i = 0; i < vetorX.length; i++) {
            System.out.println(vetorX[i]);
        }
    }
}
