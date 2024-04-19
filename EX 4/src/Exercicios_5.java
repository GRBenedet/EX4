public class Exercicios_5 {
    public static void main(String[] args) {
        int i;

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorAB = new int[10];

        for (i = 0; i < vetorA.length; i++){
            vetorA[i] = i * 2;
            vetorB[i] = i * 3;
            vetorAB[i] = vetorA[i] * vetorB[i];
        }
        System.out.println("esta é a fusão de seus vetores");
        for (i = 0; i < vetorAB.length; i++){
            System.out.println(vetorAB[i]);
        }
    }
}
