public class Exercicios_1 {

    public static void main(String[] args) {
        int i;
        int [] vetorX = new int[10];
       
        for (i = 0; i < vetorX.length; i++){
            vetorX[i] = 30;
        }
        System.out.println("este é o seu vetor");
        for (i = 0; i < vetorX.length; i++){
            System.out.println(vetorX[i]);
        }
    }
}